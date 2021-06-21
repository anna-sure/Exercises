public class Homework13 {
    public static void main(String[] args) {

        Circle02 c = new Circle02();
        PassObject po = new PassObject();
        po.printArea(c, 5);
        }
    }


class Circle02 {
    double radius;

    public Circle02() { }


    public Circle02(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printArea(Circle02 c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println((double) i + "\t" + c.findArea());
        }
    }
}