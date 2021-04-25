package Sunday_425;

public class YangHuiTriangle {
    public static void main(String[] args) {

        //規律：arr[i][j] = arr[i-1][j] + arr[i-1][j-1];

        int[][] yangHui = new int[12][];
        for (int i = 0; i < yangHui.length; i++) {//遍歷yangHui每個元素

            //給每個一緯陣列（行）開空間
            yangHui[i] = new int[i + 1]; //第一行有1個元素，第n行有n個元素，每行加1個元素
            //給每個一緯陣列（行）賦值
            for (int j = 0; j < yangHui[i].length; j++) {
                //每一行的第一元素和最後一個元素都是1
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else { //中間的元素規律
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            }
        }

        System.out.println("============ 楊輝三角 ===========");
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println(); //輸出每行後換行
        }


    }
}
