package Monday_426;
/*
有一堆桃子，猴子第一天吃其中的一半，並再多吃了一個
以後每天猴子都吃其中的一半，然後再多吃一個
當到第10天的時候，想再吃時，發現只有一個桃子
問：最初一共有多少個桃子？
 */
public class RecursionPeach {
    public static void main(String[] args) {
        Peach peach = new Peach();
        System.out.println(peach.peach(1));//第1天的桃子數量1534個

    }
}

class Peach {

    public int peach(int day) {
        if (day == 10) { //第10天 只有一個桃子
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day rang is 1-10");
            return -1;
        }

    }


}