package Encapsulation;

public class Encapsulation01 {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(50000);

        System.out.println(person.info());
        System.out.println(person.getSalary());

        Person smith = new Person("smith",290000,50000);
        System.out.println("===smith's information:===");
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //无参数构造器
    public Person(){

    }
    //带三个属性的构造器
    public Person(String name, int age, double salary){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //将set方法写在构造器中，才可以进行逻辑验证

        setName(name);
        setAge(age);
        setSalary(salary);

    }

    public void setName(String name){
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("wrong name");
            this.name = "no name";
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
          System.out.println("age range is 0-120,default age is 18");
          this.age = 18;
        }
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    //写一个方法 返回属性信息
    public String info(){
        return "name = " +name + " age = " + age + " salary = " + salary;
    }
}