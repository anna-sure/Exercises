package Tues_0504.innerclass_;
/*
演示局部內部類的使用
 */

public class InnerClass { //外部其他類
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.m1();

    }
}

class Outer{ //外部類
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer m2()");
    }

    public void m1(){//方法


        class Inner{ //內部類（定義在外部類的方法中）
            //局部內部類，不能添加訪問修飾符，但可以使用final修飾，修飾後不能被繼承
            //作用域：僅僅在定義它的方法或代碼塊中
            private int n1 = 800;

            public void f1(){ //局部內部類可以直接訪問外部類的所有成員，包括私有成員（屬性+方法）
                System.out.println("n1 = "+ n1 +"外部類的n1="+ Outer.this.n1);
                //內部類屬性與外部類屬性重名時，默認就近原則訪問，
                //如果要訪問外部類的屬性，用外部類名.this.屬性名訪問
                //Outer.this 本質就是外部類的對象，即哪個對象調用了m1，Outer.this就是哪個對象
                m2();
            }


        }
        //外部類在方法中，可以創建Inner對象，然後調用方法即可
        Inner inner = new Inner();
        inner.f1();


    }


}