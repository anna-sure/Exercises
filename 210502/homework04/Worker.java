package Sun_0502.homework;

class Worker extends Employee{
    public Worker(String name, double singleDaySal, int workDays, double grade) {
        super(name, singleDaySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.print("worker ");
        super.printSal();
    }
}

class Manager extends Employee{

    private double bonus;
    //創建manager物件時，bonus不確定，因此在建構子中不給bonus屬性
    //在set中設置bonus
    public Manager(String name, double singleDaySal, int workDays, double grade) {
        super(name, singleDaySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("Manager " + getName() + " total salary: "
                + (bonus + getSingleDaySal() * getWorkDays() * getGrade()));


    }
}