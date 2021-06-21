public class Homework05 {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println("area = "+String.format("%.2f",circle.area()));
        System.out.println("len = "+String.format("%.2f",circle.len()));
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double len() {
        return 2 * Math.PI * radius;
    }
}