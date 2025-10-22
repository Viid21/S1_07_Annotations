package level1.ex1.Model;

public class WorkerInPerson extends Worker {
    private static int gas;

    public WorkerInPerson(String name, String surname, int priceHours) {
        super(name, surname, priceHours);
    }

    public static void setGas(int gas) {
        WorkerInPerson.gas = gas;
    }

    @Override
    public int calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + gas;
    }
}
