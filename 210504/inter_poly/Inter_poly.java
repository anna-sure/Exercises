package Tues_0504;

public class Inter_poly {
    public static void main(String[] args) {

        USB [] usb = new USB[2];
        usb[0] = new Phone(); //接口類型可以指向實現了該接口的對象實例
        usb[1] = new Camera(); //跟父子類繼承一樣，可以向下轉型
//        usb[0].work();
//        usb[1].work();

        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if(usb[i] instanceof Phone){
                ((Phone) usb[i]).call();
            }
        }



    }

}

interface USB {
    void work();
}

class Phone implements USB{
    @Override
    public void work() {
        System.out.println("phone works");
    }

    public void call(){
        System.out.println("phone is calling");
    }

}

class Camera implements USB {
    @Override
    public void work() {
        System.out.println("camera works");
    }
}