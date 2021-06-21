public class Homework01 {
    public static void main(String[] args) {

        double[] arr = {23.6,55.6,12.0,99.2,18.8,17.2};
        A01 a01 = new A01();
        Double res = a01.max(arr); //res是Double包裝類的一個對象
        if(res!=null){
            System.out.println("arr max = "+res);
        } else {
            System.out.println("null");
        }

    }
}

class A01{
    public Double max(double[]arr) { //此處這邊返回 Double包裝類
        if (arr != null && arr.length > 0) {
            double max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }  else {
            return null; //null可以返回給包裝類Double
        }

    }
}