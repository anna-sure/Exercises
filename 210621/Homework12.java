public class Homework12 {
    public static void main(String[] args) {

    }
}
class Employee{
    String name;
    char gender;
    int age;
    String job;
    double salary;

    public Employee(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }
    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Employee(String name, char gender, int age, String job, double salary) {
        this(name,gender,age); //使用到了上面的構造器
        this.job = job; //this(job,salary) X，this只能放在第一條語句
        this.salary = salary;
    }
}