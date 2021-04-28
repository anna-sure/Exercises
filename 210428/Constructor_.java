package wed_210428;

public class Constructor_ {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("jack", 28);

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

    }
}

class Person {

    String name;
    char gender;
    int age;
    String job;
    double salary;

    //複用constructor
    public Person(String job, double salary) {
        this.job = job;
        this.salary = salary;
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(String job, double salary, String name, char gender, int age) {
        this(name, gender, age); //複用了前面構造器
        this.job = job;
        this.salary = salary;
    }


    public Person() {
        age = 18;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}