package Tues_0504.homework;

public class Frock {

    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() { //建構子
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {//get方法
        return serialNumber;
    }

    public static int getNextNum() {//方法
        return currentNum += 100;
    }
}

    class TestFrock{
        public static void main(String[] args) {
            System.out.println("序列號為："+Frock.getNextNum());
            System.out.println("序列號為："+Frock.getNextNum());

            Frock frock = new Frock();
            System.out.println(frock.getSerialNumber());

            Frock frock2 = new Frock();
            System.out.println(frock2.getSerialNumber());

            Frock frock3 = new Frock();
            System.out.println(frock3.getSerialNumber());


        }



    }



