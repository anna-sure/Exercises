package Sun_0502.homework05;

public class Scientist extends Employee{

    private double bonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.print("Scientist ");
        System.out.println(getName() + " annual salary is "
                + (getSalary() * getSalMonth() + bonus));
    }
}
