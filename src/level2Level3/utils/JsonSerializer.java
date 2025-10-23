package level2Level3.utils;

import level2Level3.annotations.SaveToJson;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public final class JsonSerializer {
    public static void serialize(Object obj) throws IOException, IllegalAccessException {
        Class<?> clazz = obj.getClass();

        SaveToJson saveToJson = clazz.getAnnotation(SaveToJson.class);
        if (saveToJson == null) {
            throw new IllegalArgumentException("The class " + clazz.getName() + " does not contain the proper annotation.");
        }

        Map<String, Object> jsonMap = new LinkedHashMap<>();
        Path dir = Path.of(saveToJson.directory());
        Path file = dir.resolve(clazz.getSimpleName() + ".json");

        StringBuilder jsonContent = new StringBuilder();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(obj));
        }

        jsonContent.append("{\n");

        int i = 0;
        int size = jsonMap.size();
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            jsonContent.append("  \"").append(entry.getKey()).append("\": ").append(formatJsonValue(entry.getValue()));
            if (++i < size) {
                jsonContent.append(",");
            }
            jsonContent.append("\n");
        }
        jsonContent.append("}\n");

        Files.createDirectories(dir);

        Files.writeString(file, jsonContent.toString());

    }

    private static String formatJsonValue(Object value) {
        if (value instanceof String) {
            return "\"" + value.toString().replace("\"", "\\\"") + "\"";
        }
        return String.valueOf(value);
    }

}
