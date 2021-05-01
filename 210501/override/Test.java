package Sat_0501.encap.override;

public class Test {
    public static void main(String[] args) {

        Person jack = new Person("jack", 20);
        System.out.println(jack.say());

        Student david = new Student("david", 33, "000001", 100);
        System.out.println(david.say());



    }
}
