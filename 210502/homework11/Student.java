package Sun_0502.homework11;

public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study(){
        System.out.println("student study");
    }

    public static void main(String[] args) {

        Person p = new Student("jack"); //向上轉型
        p.eat();
        p.run();
        //編譯時只認編譯類型->Person，so無法調student的study方法
        //運行時動態綁定，運行student的eat 和 run方法
        System.out.println("==========================");
       //向下轉型 把指向子類對象的父類引用，轉成指向子類對象的子類引用
        // 都是指向子類對象，不過引用變化了而已
        Student s = (Student)p;
        s.eat();
        s.run();
        s.study(); //這樣就可以調用子類的study方法

    }
}
