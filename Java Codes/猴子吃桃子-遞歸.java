/*
猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，
想再吃时（即还没吃），发现只有 1 个桃子了。问题：最初共多少个桃子？

思路分析 逆推
1. day = 10 时 有 1 个桃子
2. day = 9 时 有 (day10 + 1) * 2 = 4
3. day = 8 时 有 (day9 + 1) * 2 = 10
4. 规律就是 前一天的桃子 = (后一天的桃子 + 1) *2
5. 递归
*/

public class JavaDoc {
    public static void main(String[] args) {
      
       T t = new T();
       System.out.println("第1天的桃子數量為："+t.peach(1));
    
    
    }
}


class T {

    public int peach(int days) {
        if (days == 10) {
            return 1;
        } else if (days >= 1 && days < 10) {
            return (peach(days + 1) + 1) * 2;
        } else {
            System.out.println("between 1-10");
            return -1;
        }
    }
}
