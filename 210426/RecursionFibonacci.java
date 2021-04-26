package Monday_426;

public class RecursionFibonacci {
    public static void main(String[] args) {
        /*
        使用遞歸方法，求出斐波那契數1，1，2，3，5，8，13...
        給你一個整數n，求出它的值是多少
         */

        T t = new T();
        System.out.println("當n=7 對應的斐波那契數= "+t.fibonacci(7));

    }
}

class T {

    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求 n >= 1");
            return -1;
        }
    }
}