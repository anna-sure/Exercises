package chapter06;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {

        double[] scores = new double[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("input "+(i+1)+" score");
            scores[i] = scanner.nextDouble();
        }

        System.out.println("\n===============");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1)+" score is "+scores[i]);
        }

    }
}
