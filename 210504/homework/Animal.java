package Tues_0504.homework;

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("貓會喵喵叫");
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗會汪汪叫");
    }
}

class Test{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();

        Animal dog = new Dog();
        dog.shout();

    }
}