package wed_210428;

import org.w3c.dom.ls.LSOutput;

public class CirclePrintArea {

    public static void main(String[] args) {

       Circle c = new Circle();
       PassObject po = new PassObject();
       po.printArea(c,5);


    }
}

class Circle {

    double radius;

//    public Circle(){
//
//    }
//
//    public Circle(double radius) { //記得constructor 下面有set方法 此處可以不寫
//        this.radius = radius;
//    }

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius){
        this.radius = radius; //添加set方法，修改物件的半徑值
    }

}

class PassObject {
    public void printArea(Circle c, int times) { //傳入類作為形參
        System.out.println("=== radius    area ===");
        for (int i = 1; i <= times; i++) { //輸出1到times之間的每個整數半徑值
            c.setRadius(i); //修改c物件的半徑值
            System.out.println(i+" "+c.findArea(i));
        }
    }

}
