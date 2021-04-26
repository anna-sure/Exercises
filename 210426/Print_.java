package Monday_426;

public class Print_ {
    public static void main(String[] args) {
        AA a = new AA();
        a.print(3, 4, '*');

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};

        a.printArr(arr);

    }
}

// 1 方法返回值
// 2 方法名稱
// 3 方法形參
// 4 方法體
class AA {

    public void print(int row, int col, char c) { //打印星星
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public void printArr(int[][] map) { //打印二維陣列
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}