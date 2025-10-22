package level1.ex2;

import level1.ex2.Model.WorkerInPerson;
import level1.ex2.Model.WorkerOnline;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        WorkerOnline workerOnline = new WorkerOnline("Paco", "Fiestas", 7, 60);
        WorkerInPerson workerInPerson = new WorkerInPerson("Maria", "Dolores", 7);
        WorkerInPerson.setGas(90);

        System.out.println("worker online salary: " + workerOnline.calculateSalary(60));
        System.out.println("worker in-site salary: " + workerInPerson.calculateSalary(60));

        System.out.println("worker in-site parking price: " + workerInPerson.calculateParkingPrice(60, 200));
    }

}
