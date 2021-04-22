package Triangle;

import java.util.Scanner;

public class PrintPrice {
    public static void main(String[] args) {
     //輸入月份，判斷淡旺季票價
        System.out.println("month = ");
        Scanner month1 = new Scanner(System.in);
        int month = Integer.parseInt(month1.next());

        //判斷年齡
        System.out.println("age = ");
        Scanner age1 = new Scanner(System.in);
        int age = Integer.parseInt(age1.next());

        //進入判斷
        if(month >= 4 && month <= 10){

            if(age < 18){
                System.out.println("price is 30 yuan.");
            } else if (age >= 18 && age <= 60){
                System.out.println("price is 60 yuan.");
            } else {
                System.out.println("price is 20");
            }

        } else {
            if ( age >= 18 && age <= 60 ){
                System.out.println("price is 40 yuan.");
            } else {
                System.out.println("price is 20 yuan.");
            }
        }


    }
}
