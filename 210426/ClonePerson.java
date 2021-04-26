package Monday_426;

public class ClonePerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "jack";
        p.age = 18;

        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);
        //到此，p和p2都是Person對象，但是兩個獨立的對象
        System.out.println(p.age + p.name);
        System.out.println(p2.age + p2.name);

    }
}

class Person{
    String name;
    int age;
}

class MyTools {
    //編寫一個方法copyPerson，可以複製一個Person對象，返回複製的對象
    //要求得到新對象和原來的對象是兩個獨立的對象，只是屬性相同
    public Person copyPerson (Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }

}