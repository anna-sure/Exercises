package Sunday_425;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {

        //原有陣列
        int[] arr = {1, 2, 3};

        //定義在外層，需要使用到至少兩次
        Scanner scanner = new Scanner(System.in);

        do {

            int[] newArr = new int[arr.length + 1]; //需要定義在內層，否則陣列長度永遠是4
            //把num保存到newArr
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i]; //copy arr to newArr
            }

            //接收用戶手動輸入，必須為string格式(鬼知道用戶會輸入什麼)，再轉換成int
            System.out.println("please enter a number:");
            int addNum = Integer.parseInt(scanner.next());
            newArr[newArr.length - 1] = addNum; //num賦值給newArr最後一個數
            arr = newArr; //更新arr

            System.out.println("============ newArr =============");
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }

            //提示用戶是否繼續添加，否則退出loop
           System.out.println("是否繼續添加：(y/n)");
            char ans = scanner.next().charAt(0);

            //首先排除行不通的答案，代碼比較少 ***
            //否則寫完pass的條件，還要再寫nopass條件
            if (ans == 'n') {
                System.out.println("您退出了添加");
                break;
            }
        } while (true);


    }
}
