package Tues_0504.homework;

public class A {
    private String name = "hello";

    public void f1() {
        class B { //局部內部類 定義在方法中
            private final String NAME = "sure";

            public void show() {
                System.out.println("NAME = " + NAME);
                System.out.println("class A String = " + name);
            }
        }
        B b = new B();
        b.show();

    }
}

class Test2 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();

    }
}