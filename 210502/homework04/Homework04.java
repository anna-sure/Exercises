package Sun_0502.homework;

public class Homework04 {
    public static void main(String[] args) {

        Manager manager = new Manager("jack", 100, 20, 1.2);
        manager.setBonus(3000);
        manager.printSal();

        Worker worker = new Worker("eva", 50, 10, 1.0);
        worker.printSal();

    }

}

class Employee {
    private String name;
    private double singleDaySal;
    private int workDays;
    private double grade;

    public Employee(String name, double singleDaySal, int workDays, double grade) {
        this.name = name;
        this.singleDaySal = singleDaySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleDaySal() {
        return singleDaySal;
    }

    public void setSingleDaySal(double singleDaySal) {
        this.singleDaySal = singleDaySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSal() { //實際開發 方法也是寫在setget下面
        System.out.println(name + " total salary: " + singleDaySal * workDays * grade);
    }

}