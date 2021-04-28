package wed_210428;

public class Overload_ {
    public static void main(String[] args) {

        Methods methods = new Methods();
        methods.m(10);
        methods.m(10, 20);
        methods.m("hello");

        System.out.println(methods.max(20,66));
        System.out.println(methods.max(33.3,99.9));
        System.out.println(methods.max(11.1,77.7,33.3));

    }
}

class Methods {

    public void m(int a) {
        System.out.println(a * a);
    }

    public void m(int a, int b) {
        System.out.println(a * b);
    }

    public void m(String str) {
        System.out.println(str);
    }

    public int max(int a, int b) {
        return a > b ? a :b;
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public double max(double a, double b, double c) {
        double max1 = a > b ? a :b;
        return max1 > c ? max1 : c;

    }

}