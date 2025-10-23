package level2;

import level2.model.Worker;
import level2.utils.JsonSerializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Maria", "Dolores", 7);
        try {
            JsonSerializer.serialize(worker);
        } catch (IOException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("JSON saved in: out/level2" + worker.getClass().getSimpleName());
    }
}
