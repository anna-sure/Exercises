package Sun_0502.homework05;

public class Test {
    public static void main(String[] args) {

        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(10); //可以動態修改帶薪月份salMonth ：）
        jack.printSal();

        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();

        Teacher teacher = new Teacher("老韓", 2000);
        teacher.setClassDay(360);
        teacher.setClassSal(1000);
        teacher.printSal();

        Scientist tom = new Scientist("tom", 20000);
        tom.setBonus(2000000);
        tom.printSal();

    }
}
