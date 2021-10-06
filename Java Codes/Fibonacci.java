public class JavaDoc {
    public static void main(String[] args) {

      T t = new T();
      System.out.println("數字7的 斐波那契数 為: "+t.fibonacci(7));
      
    }
}

class T {

    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return (fibonacci(n - 1) + fibonacci(n - 2));
            }
        } else {
            System.out.println("數字必須大於等於1");
            return -1;
        }

    }

}
