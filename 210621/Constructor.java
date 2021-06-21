public class Constructor {
    public static void main(String[] args) {

        Person p1 = new Person("jack",80);
        System.out.println(p1.name+p1.age);


    }
}

class Person{
    String name;
    int age;

    public Person(String pName,int pAge){
        System.out.println("lalala");
        name = pName;
        age = pAge;
    }
}