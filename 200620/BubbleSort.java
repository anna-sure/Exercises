package chapter06;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2, 5, 88, -13, -77, 77, 99, 66, 666, 888, 999, 1000, -1, 10, 0};
        int temp = 0;

        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("========================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
