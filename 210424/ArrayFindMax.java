package saturday_424;

public class ArrayFindMax {
    public static void main(String[] args) {

        int[] arr = {4, 6, 8, 8, 13, -7, 34, 57, 900, 33, 567, 876};
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; //此處不需增加temp來兩數交換，沒有要排序，只是直接賦值給max
                maxIndex = i;

            }
        }
        System.out.println("max = " + max +" maxIndex = "+maxIndex);


    }
}
