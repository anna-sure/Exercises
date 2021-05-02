package Sun_0502.homework05;

public class Employee {

    private String name;
    private double salary;
    private int salMonth = 12;

    public Employee(String name, double salary) { //salMonth通過set單獨設置
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal(){
        System.out.println(name + " annual salary is " + (salary * salMonth));
    }

}
