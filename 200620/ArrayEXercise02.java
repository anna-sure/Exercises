package chapter06;

public class ArrayEXercise02 {
    public static void main(String[] args) {

        int [] arr = {45,5,5,6,6,5,6,3,88,55,22,33,66,44,88,100};
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }

        }
        System.out.println("max = "+max+" maxIndex = "+maxIndex);
    }
}
