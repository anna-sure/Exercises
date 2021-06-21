package chapter06;

import java.util.Scanner;

public class SepSearch {
    public static void main(String[] args) {

        String[] arr = {"smith", "mary", "jack", "david", "lily", "tomato"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("tell me your answer string is:");
        String ans = scanner.next();

        int findIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (ans.equals(arr[i])) {
                findIndex = i;
                System.out.println("found it," + ans + " is in the string arr"
                        + ",and findIndex = " + findIndex);
                break;
            }
        }
        if (findIndex == -1) {
            System.out.println("not found ~");

        }
    }
}
