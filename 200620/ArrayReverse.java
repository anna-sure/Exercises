package chapter06;

public class ArrayReverse {
    public static void main(String[] args) {

        int arr [] = {2,5,7,8,9,4,2,1,11,0,9};

        int arrReverse [] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length-1-i];
        }

        System.out.println("===== arrReverse ========");
        for (int i = 0; i < arrReverse.length; i++) {
            System.out.print(arrReverse[i]+"\t");

        }
    }
}
