package chapter06;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3};

        do {
            System.out.println("which num do you want to add this arr?");
            int addNum = scanner.nextInt();

            int[] arrNew = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }

            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;

            System.out.println("\n======== arrNew is ===========");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }

            System.out.println("\ndo you want to add new num ? y/n");
            char ans = scanner.next().charAt(0);

            if(ans == 'n'){
                break;
            }
        } while (true);
    }
}