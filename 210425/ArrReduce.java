package Sunday_425;

import java.util.Scanner;

public class ArrReduce {
    public static void main(String[] args) {

        //原有陣列
        int[] arr = {1, 2, 3, 4, 5, 6};

        //定義在外層，需要使用到至少兩次
        Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("縮減了arr陣列的最後一個數字");

                int[] newArr = new int[arr.length - 1]; //需要定義在內層，否則陣列長度永遠是4
                //把num保存到newArr
                for (int i = 0; i < arr.length - 1; i++) {
                    newArr[i] = arr[i]; //copy arr to newArr
                }

                arr = newArr; //更新arr,讓arr指向newArr

                System.out.println("============ newArr =============");
                for (int i = 0; i < newArr.length; i++) {
                    System.out.println(newArr[i]);
                }

                //提示用戶是否繼續添加，否則退出loop
                System.out.println("是否繼續縮減：(y/n)");
                char ans = scanner.next().charAt(0);

                //首先排除行不通的答案，代碼比較少 ***
                //否則寫完pass的條件，還要再寫nopass條件
                if (ans == 'n') {
                    System.out.println("您退出了添加");
                    break;
                } else if (newArr.length == 1){
                    System.out.println("已無法再縮減newArr陣列長度，退出縮減");
                    break;
                }


            } while (true);


        }
    }


