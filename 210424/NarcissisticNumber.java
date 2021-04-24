package saturday_424;

import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        //用戶輸入一個三位數的整數
        while (true) {
            System.out.println("please enter a number(100-999):");
            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.next());
            //個位、十位、百位數取得
            int num100 = num / 100;
            int num10 = num % 100 / 10;
            int num1 = num % 10;
            //判斷是否為水仙花數
            if (num >= 100 && num <= 999) {
                if (num == num100 * num100 * num100
                        + num10 * num10 * num10 + num1 * num1 * num1) {
                    System.out.println("it's a Narcissistic Number");
                    break;
                } else {
                    System.out.println("這不是水仙花數，請重新輸入");
                }

            }

        }

    }
}
