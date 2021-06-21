package chapter06;

public class ArrayAssign {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;//參 arr1董跤 arr2
        arr2[0] = 10;

        //艘艘arr1腔硉
        System.out.println("====arr1====");
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//10, 2, 3
        }

        System.out.println("====arr2====");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//10, 2, 3
        }


    }
}
