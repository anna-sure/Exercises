public class ConstructorExercise {
    public static void main(String[] args) {

        Person3 p1 = new Person3();
        System.out.println("p1.name = "+p1.name+" p1.age = "+p1.age);

        Person3 scott = new Person3("scott", 48);
        System.out.println(scott.name+" "+scott.age);
    }
}

class Person3 {
    String name;
    int age;

    public Person3() {
        age = 3;
    }
    public Person3(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}