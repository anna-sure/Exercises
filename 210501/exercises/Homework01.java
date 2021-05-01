package Sat_0501.exercises;

public class Homework01 {

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 10, "JavaEE engineer");
        persons[1] = new Person("tom", 50, "Bigdata engineer");
        persons[2] = new Person("mary", 35, "AI engineer");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);//默認調物件的toString方法
        }

        //使用冒泡排序 從大到小排序年齡
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) { //對比年齡
                    temp = persons[j]; //交換的是物件本身，不用交換物件.getAge();
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

        //排序後的結果
        System.out.println("============ 年齡排序後 ==================");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }

}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}