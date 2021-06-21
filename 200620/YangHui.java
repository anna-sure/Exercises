package chapter06;

public class YangHui {
    public static void main(String[] args) {

        int[][] yangHui = new int[7][];

        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1]; //依升序開闢空間

            for (int j = 0; j < yangHui[i].length; j++) {
                if (j == 0 || j == yangHui[i].length - 1) { //每行第一個和最後一個 賦值為1
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1]; //其餘=上一行的同列j + 上一行j-1 的和
                }
            }

        }
        System.out.println("=================");
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
