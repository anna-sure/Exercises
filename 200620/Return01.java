package chapter05;

public class Return01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if(i==3){
                System.out.println("i = "+i);
                return;
            }
            System.out.println("hello world");

        }
        System.out.println("go on");
    }
}
