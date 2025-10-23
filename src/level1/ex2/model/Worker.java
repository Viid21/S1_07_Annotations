package level1.ex2.model;

public abstract class Worker {
    String name;
    String surname;
    int priceHours;

    public Worker(String name, String surname, int priceHours) {
        this.name = name;
        this.surname = surname;
        this.priceHours = priceHours;
    }

    public int calculateSalary(int workedHours) {
        return workedHours * this.priceHours;
    }
}
