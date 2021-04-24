package saturday_424;

public class GetSum {
    public static void main(String[] args) {
        //求出1-1/2+1/3-1/4⋯⋯1/100的和
        //隱藏條件，要將分子1換成1.0才能得到精確的小數，不然（1/2+1/3-1/4⋯⋯1/100）全是0
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += (1.0 / i);
            } else {
                sum -= (1.0 / i);
            }
        }
        System.out.println("sum = " + sum);

        //求1+(1+2)+(1+2+3)+(1+2+3+4)+⋯⋯(1+2+100)的和
        //一共有100項相加
        //每一項的數字在逐漸增加，是一個雙重循環

        int sum2 = 0;
        for (int i = 1; i <= 100; i++) { //i表示外層循環數，並且是內層循環裡最後一個數
            for (int j = 1; j <= i; j++) {//內層數1-i進行循環
                sum2 += j;
            }
        }
        System.out.println("sum =" + sum2);
    }

}

