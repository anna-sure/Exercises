package saturday_424;

public class A_Za_z {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }

        //創建一個char類型的26個元素的數組，分別放置'A'-'Z'
        // 使用for loop訪問所有元素並列印出來

        char[] arr = new char[26];
        for (char i = 0; i < arr.length ; i++) {
            arr[i] = (char)('A' + i); //int強制轉型->char
            //'A' + 1 = 'B' 才可以充分在兩個地方使用i
        }
        System.out.println();
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
