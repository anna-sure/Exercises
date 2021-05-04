package Tues_0504.homework;

class Phone{
    //當調用testWork方法時，直接傳入一個實現了Calculator接口的匿名內部類即可
    public void testWork(Calculator calculator,double n1,double n2){
        double res = calculator.work(n1,n2);
        System.out.println("計算後的結果是："+ res);
    }
}

interface Calculator {
    public double work(double n1,double n2);//該方法完成怎樣的計算，交給匿名內部類去完成
}

class Test1{
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },9,6);

    }
}
