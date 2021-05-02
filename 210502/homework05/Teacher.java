package Sun_0502.homework05;

public class Teacher extends Employee{

    private int classDay;
    private double classSal; //這兩項是有變化的，不給建構子，用set靈活設置

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSal() {
        System.out.print("Teacher ");
        System.out.println(getName() + " annual salary is "
                + (getSalary() * getSalMonth() + classSal * classDay));
    }
}
