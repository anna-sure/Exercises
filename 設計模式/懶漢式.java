package chapter10;

/**
 * 演示懶漢式的單例模式
 * 只有當用戶調用getInstance時，才返回cat對象
 * 後面再次調用，會返回上次創建的cat對象
 * 從而保證了單例
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);

        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);

        System.out.println(cat == cat1); // true

    }

}
//設計成在程序運行中，只能創建一個對象
class Cat{
    private String name;
    private static Cat cat;

    //implements steps
    //1.privated constructor
    //2.set a static field     private static Cat cat;
    //3.supply a public static method which return a Cat instance

    private Cat(String name) {
        System.out.println("Cat constructor is running...");
        this.name = name;
    }

    public static Cat getInstance(){

        if(cat == null){
            cat = new Cat("鹹酥雞");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
