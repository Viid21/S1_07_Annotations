package level1.ex1.Model;

public class WorkerOnline extends Worker {
    final int INTERNET_PRICE;

    public WorkerOnline(String name, String surname, int priceHours, int internetPrice) {
        super(name, surname, priceHours);
        this.INTERNET_PRICE = internetPrice;
    }

    @Override
    public int calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + this.INTERNET_PRICE;
    }
}
