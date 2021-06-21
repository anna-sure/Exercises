package chapter05;

public class WhileExercise {
    public static void main(String[] args) {

        int i = 1;
        int endNum = 100;
        int count = 0;
        while (i <= endNum) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
                count++;

                if (count % 5 == 0) {
                    System.out.println();
                }
            }
            i++;
        }
        System.out.println("\n===============");
        int flag = 0;
        int j = 1;
        int end = 200;
        while (j <= end) {
            if (j % 2 == 0) {
                System.out.print(j + "\t");
                flag++;
                if (flag % 5 == 0) {
                    System.out.println();
                }
            }
            j++;
        }


    }
}
