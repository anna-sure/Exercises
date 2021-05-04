package Tues_0504;

public class inter_extends {
    public static void main(String[] args) {

        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swiming();
        wuKong.flying();

    }

}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climbing(){
        System.out.println(name + " 會爬樹");
    }
}

class LittleMonkey extends Monkey implements Fishable,Birdable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void climbing() {
        System.out.println(getName()+"會爬樹");
    }

    @Override
    public void swiming() {
        System.out.println(getName() + "通過學習，可以像魚兒一樣游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通過學習，可以像小鳥一樣飛翔");
    }
}

interface Fishable{
    void swiming();
}

interface Birdable{
    void flying();
}
