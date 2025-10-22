package level1.ex1;

import level1.ex1.Model.WorkerInPerson;
import level1.ex1.Model.WorkerOnline;

public class Main {
    public static void main(String[] args) {
        WorkerOnline workerOnline = new WorkerOnline("Paco", "Fiestas", 7, 60);
        WorkerInPerson workerInPerson = new WorkerInPerson("Maria", "Dolores", 7);
        WorkerInPerson.setGas(90);

        System.out.println("worker online salary: " + workerOnline.calculateSalary(60));
        System.out.println("worker in-site salary: " + workerInPerson.calculateSalary(60));
    }

}
