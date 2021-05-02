package Sun_0502.homework05;

public class Worker extends Employee{

    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.print("worker ");
        super.printSal();
    }
}
