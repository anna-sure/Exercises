package chapter05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input a-c");
        char c = scanner.next().charAt(0);

        switch(c){
            case 'a':
                System.out.println("aaaaa");
                break;
            case 'b':
                System.out.println("bbbbb");
                break;
            case 'c':
                System.out.println("ccccc");
                break;
            default:
                System.out.println("you got wrong way ");

        }
        System.out.println("you finished ");

    }
}
