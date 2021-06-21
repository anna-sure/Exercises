public class Homework06 {
    public static void main(String[] args) {

        Cale cale = new Cale(10,20);
        System.out.println("sum = "+ cale.sum());
        System.out.println("minus = "+cale.minus());
        System.out.println("multi = "+cale.multi());
        Double divRes = cale.div();
        if(divRes != null){
            System.out.println("div = "+cale.div());
        }
    }
}

class Cale{
    double d1;
    double d2;
    public Cale(double d1,double d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    public double sum(){return d1 + d2;} //走構造器 不用形參

    public double minus(){return d1 - d2;} //走構造器 不用形參

    public double multi(){return d1 * d2;} //走構造器 不用形參

    public Double div(){ //走構造器 不用形參
        if(d2 == 0){
            System.out.println("cant solve 0");
            return null; //需要將返回類型double 準成Double包裝類才可return null
        } else{
            return d1 / d2;
        }
    }
}