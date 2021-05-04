package Tues_0504.anonymousInnerClass;

/*
演示匿名內部類的使用
匿名內部類其實是有名字的->外部類名+$1
只是僅能使用一次，所以叫匿名內部類

匿名內部類既是一個類的定義，同時它本身也是一個對象，
因此從語法上看，它既有定義類的特徵，也有創建物件的特徵
 */
public class AnonymousInnerClass { //外部其他類
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}

class Outer { //外部類

    private int n1 = 10;

    public void method() {
        //基於接口的匿名內部類
        //需求是Tiger類只使用一次，後面就不再使用->使用匿名內部類來簡化開發
        //tiger編譯類型：IA
        //tiger運行類型：就是匿名內部類 類名XXX => Outer$1
        /*
        看底層：
        class XXX implements IA {
               @Override
                public void cry() {
                    System.out.println("tiger shout...");
                }
             }
         */
        //jdk底層在創建匿名內部類（new了一把）Outer$1同時，
        // 立馬就創建了Outer$1的實例，並且把地址返回給tiger
        //匿名內部類使用一次，就不能再使用，但是其返回給到的tiger對象，可以重複使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger shout...");
            }
        }; //要有分號
        System.out.println("tiger的運行類型= " + tiger.getClass()); //Outer$1
        tiger.cry();
        tiger.cry();
        tiger.cry(); //返回的

        //基於類的匿名內部類
        //Father的編譯類型：Father
        //Father的運行類型: Outer$2
        //底層會創建匿名內部類：
        /*
            class extends Father {
             @Override
             public void test() {
                System.out.println("匿名內部類重寫了test方法");
               }
            }
         */
        //同時也直接返回了 匿名內部類Outer$2的對象，對象也可以反覆使用
        //注意："jack"參數列表會自動傳遞給建構子
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名內部類重寫了test方法");
            }
        }; //要有分號，本質是創建對象，所以分號不能少，上面同樣
        System.out.println("Father運行類型 = " + father.getClass());//Outer$2
        father.test();

        new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名內部類重寫了test方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack"); // 還可以傳參數進去，所以super.ok還是調到Father類：Father ok()jack
        //.test(); // 也可以不用引用，直接調用，因為其本身就是一個對象

        //基於抽象類的匿名內部類 必須實現裡面的抽象方法
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("animal eat");
            }
        };
        animal.eat();

    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) { //建構子
        System.out.println("接收到的 name = "+name);
    }

    public void test() {
    }

    public void ok(String str){
        System.out.println("Father ok()"+ str);
    }
}

abstract class Animal{
    abstract void eat();
}





