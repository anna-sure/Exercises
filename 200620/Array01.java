package chapter06;

public class Array01 {
    public static void main(String[] args) {

        double[] beans ={3,5,7,8,1,2.3,89,88,6,66.6,77.5,77};

        double totalWeight = 0;
        for (int i = 0; i < beans.length; i++) {
            totalWeight += beans[i];
        }
        double avgWeight = totalWeight/ beans.length;
        System.out.println("totalWeight = "+totalWeight+
                " avgWeight = "+String.format("%.2f",avgWeight));

    }
}
