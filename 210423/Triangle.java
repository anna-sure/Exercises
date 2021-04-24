package Triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("please enter your stars num:");
        Scanner scanner = new Scanner(System.in);
        int stars = Integer.parseInt(scanner.next());

        System.out.println("====== 半边三角形 =========");

        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====== 等腰三角形 =========");

        for (int i = 1; i <= stars; i++) { // i = 層數
            //在輸出*之前，還要輸出空格 = 總層數 - 當前層數
            for (int k = 1; k <= stars - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) //控制打印每層*的個數
            {
                System.out.print("*");
            }
            System.out.println();//每打印一層，換行
        }

        System.out.println("=========空心三角形=============");

        for (int i = 1; i <= stars; i++) { // i = 層數
            //在輸出*之前，還要輸出空格 = 總層數 - 當前層數
            for (int k = 1; k <= stars - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) //控制打印每層*的個數
            {
                if(j == 1 || j == 2 * i - 1 || i == stars){
                    //第一行和最後一行才輸出*，最後一層i == stars也全部輸出
                System.out.print("*");
                } else { //其他情況輸出空格
                    System.out.print(" ");
                }
            }
            System.out.println();//每打印一層，換行


        }

    }
}