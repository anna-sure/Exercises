package Sat_0508;

import java.util.ArrayList;
import java.util.Comparator;


public class GenericExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("hap", 50000, new MyDate(1980, 10, 10)));

        System.out.println("employees = " + employees);

        System.out.println("========= 對員工信息進行排序 =============");
        employees.sort(new Comparator<Employee>() {//new Comparator接口的匿名內部類
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先對傳入的參數進行驗證
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("類型不匹配");
                    return 0;
                }
                //同類型，先比較name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) { //不等於0 說明上面已經在name上比較出結果了，直接返回結果i
                    return i;
                }
                //name相同，就比較year
                int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;//不等於0 說明比較出了結果，返回結果
                }

                int monthMinus = emp1.getBirthday().getMonth() - emp2.getBirthday().getMonth();
                if (monthMinus != 0) {
                    return monthMinus;//不等於0 說明比較出了結果，返回結果
                }

                return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
            }
        });

        System.out.println("========= 排序後結果 =============");
        System.out.println("employees = "+employees);


    }
}

class Employee {

    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate{ //同employee類型一致，需要new
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override //也需要重寫 不然string輸出的是地址
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}