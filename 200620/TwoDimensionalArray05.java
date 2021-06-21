package chapter06;

public class TwoDimensionalArray05 {
    public static void main(String[] args) {

        int arr [][]={{2,4,6,8},{1,3,5,7},{9,11,12,15},{1,2,3},{5,6,7}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("sum = "+sum);

    }
}
