package Sun_0502.homework13;

public class Person {

    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return name + "愛玩";
    }

    public void printInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("gender: "+sex);
    }

    @Override
    public String toString() { //重寫to string方法 ：）
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
