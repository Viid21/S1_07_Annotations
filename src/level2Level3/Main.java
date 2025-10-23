package level2Level3;

import level2Level3.annotations.SaveToJson;
import level2Level3.model.Worker;
import level2Level3.utils.JsonSerializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Maria", "Dolores", 7);
        Class<?> clazz = worker.getClass();
        try {
            JsonSerializer.serialize(worker);

            if (clazz.isAnnotationPresent(SaveToJson.class)){
                SaveToJson annotation = clazz.getAnnotation(SaveToJson.class);
                System.out.println("Out dir: " + annotation.directory());
                System.out.println("JSON saved in: " + annotation.directory() + "/" + clazz.getSimpleName() + ".json");
            }
        } catch (IOException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
