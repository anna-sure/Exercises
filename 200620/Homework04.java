package chapter06;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {7,8,55,66,22,99,11,7,10};
        System.out.println("insert a num: ");
        int insertNum = scanner.nextInt();

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = insertNum;

        arr = newArr;

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("=====================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
