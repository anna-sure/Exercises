public class ConstructorDetail {
    public static void main(String[] args) {

        Person2 jack = new Person2("jack", 88);
        Dog dog = new Dog();
        Dog wawa = new Dog("wawa");

        System.out.println(jack.age);
        System.out.println(dog); //虛擬機的16進制相對地址
        System.out.println(wawa.name);

    }
}
class Person2{
    String name;
    int age;

    public Person2(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    public Person2(String pName){name = pName;}
}
class Dog{
    String name;
    public Dog(String pName){name = pName;}
    public Dog(){}//無參建構子
}