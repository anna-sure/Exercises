package saturday_424;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //倒 序 排 列
        //第一個和最後一個相互交換，只要交換lenght/2次
        //最後一個元素是 length-1-i
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ".");
//        }

        //method2：逆序賦值法
        //先創建arr2，長度跟arr1相同
        //逆序遍歷arr1，將每個元素順序copy到arr2裡
        System.out.println("======== method 2 ===========");

        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[9 - i] = arr[i];
        }
        //此處也可以在for（）裡多定義一個j，j=0，j++ --> arr2[j] = arr[i]

        //當for loop結束，arr2就是一個逆序的數組
        //此處一定要記得讓arr指向arr2，以為需要逆序排列的是arr數組 ***
        // 因為地址傳遞，所以arr原來的數據空間沒有變量引用而被銷毀
        arr = arr2;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}

