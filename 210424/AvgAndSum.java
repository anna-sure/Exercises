package saturday_424;

import java.util.Scanner;

public class AvgAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int passNum = 0; //統計及格人數

        for(int i = 1; i <= 3; i++) {
            double sum = 0; //一個班級的總分

            for (int j = 1; j <= 5; j++) { //輸入一個班 5名學生的成績
                System.out.println("請輸入第"+ i +"班第" + j + "個學生的成績：");
                double score = scanner.nextDouble();
                System.out.println("成績為：" + score);
                sum += score; //本班總成績
                if (score >= 60) {
                    passNum++;
                }

            }
            System.out.println("第"+ i +"班的總成績為：" + sum);
            System.out.println("第"+ i +"班的平均成績為：" + (sum / 5));
            System.out.println("=======================");

            totalScore += sum; //將本班總成績加到total
        }
        System.out.println("三班總成績為：" + totalScore + "平均成績為：" + (totalScore / 3));
        System.out.println("及格人數為：" + passNum);

    }
}
