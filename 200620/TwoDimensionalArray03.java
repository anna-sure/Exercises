package chapter06;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {

        int[][] arr = new int[6][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1]; //開空間

            for (int j = 0; j < arr[i].length; j++) { //賦值
                arr[i][j] = i + 1;

            }

        }
        System.out.println("================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}
