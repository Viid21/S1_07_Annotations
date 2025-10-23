package level2Level3.model;

import level2Level3.annotations.SaveToJson;

@SaveToJson(directory = "out/level2")
public class Worker {
    String name;
    String surname;
    int priceHours;

    public Worker(String name, String surname, int priceHours) {
        this.name = name;
        this.surname = surname;
        this.priceHours = priceHours;
    }
    @Deprecated
    public int calculateSalary(int workedHours) {
        return workedHours * this.priceHours;
    }
}
