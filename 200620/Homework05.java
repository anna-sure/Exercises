package chapter06;

public class Homework05 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int max = 0;
        int sum = 0;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                sum += arr[i];
            }
            if (arr[i] == 8) {
                System.out.println("8 is in the arr[]");
            }
        }
        System.out.println("max = " + max + " maxIndex = " + maxIndex);
        System.out.println("avg = " + (sum/10));

        System.out.println("=================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
