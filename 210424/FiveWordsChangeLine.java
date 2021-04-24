package saturday_424;

public class FiveWordsChangeLine {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i);
                count++;
            }
            if (count % 5 == 0) {
                System.out.println();
            }

        }
    }


}
