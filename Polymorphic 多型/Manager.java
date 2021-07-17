package Sat_0501.encap.polyparameter;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void manage() {
        System.out.println("manager " + getName() + " is managing");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + 200000;
    }
}
