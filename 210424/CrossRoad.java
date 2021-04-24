package saturday_424;

public class CrossRoad {
    public static void main(String[] args) {

        double money = 100000;
        int count = 0;

        while (money >= 1000) {

            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if (money >= 1000 && money <= 50000) {
                money -= 1000;
                count++;
            }
        }
        System.out.println("10萬元可以通過"+ count +"次這個路口");



    }
}
