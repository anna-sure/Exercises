package saturday_424;

import java.util.Scanner;

public class DoWhileReturnMoney {
    public static void main(String[] args) {

        char ans = ' ';

        do {
            System.out.println("降龍十八掌～");
            System.out.println("還錢嗎？(y/n)");

            Scanner scanner = new Scanner(System.in);
            ans = scanner.next().charAt(0); //只接收第一個字符
            System.out.println("回答是：" + ans);


        } while (ans != 'y');

        System.out.println("收到錢啦 ：）");

    }

}
