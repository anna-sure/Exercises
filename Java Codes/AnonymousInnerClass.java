package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}

class Outer3 {
    private int n1 = 77;
    public void method() {
        IA tiger = new IA() { //anonymous inner class based in Interface
            private int n1 = 100;
            @Override
            public void shout() {
                System.out.println("tiger shout...");
                System.out.println(n1); //100
                System.out.println(Outer3.this.n1); //77
            }
        };
        System.out.println("tiger.getClass() = " + tiger.getClass());
        tiger.shout();
        //----------------------------------------------------
        Father father = new Father("jack"){ // anonymous inner class based in Class

            @Override
            public void test() {
                System.out.println("override test()...");
            }
        };
        System.out.println("father.getClass() = "+father.getClass());
        father.test();
        //------------------------------------------------------
        new Animal(){ //anonymous inner class based in Abstract Class
            @Override
            void eat() {
                System.out.println("animal eat...");
            }
        }.eat();

         new Animal(){
            @Override
            void eat() {
                System.out.println("eat...");
            }

            @Override
            public void happy() {
                System.out.println("happy everyday...");
            }
        }.happy();
    }

    interface IA {
        void shout();
    }
}

class Father{
    public Father(String name){
    }
    public void test(){};
}

abstract class Animal{
    abstract void eat();
    public void happy(){

    }
}
