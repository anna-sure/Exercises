package Extends;

public class PC extends Computer{
 private String brand;

 //构造器
    public PC(String cpu,int memory,int disk,String brand){
        //必须在子类的构造器中才能调用父类的构造器
        //只能放在构造器的第一句，也只能出现一句
        //不能和this一起使用
        super(cpu,memory,disk);
        // 调用父类的构造器，体现出继承设计的基本思想：
        // 父类构造器完成父类属性初始化，子类构造器完成子类属性的初始化
        this.brand = brand;
    }
    // get
    public String getBrand() {
        return brand;
    }
// set
    public void setBrand(String brand) {
        this.brand = brand;
    }

public void printInfo(){
        System.out.println("pc信息如下=");
        //调用父类的detail方法
       System.out.println(getDetails() + "brand = " +brand);
}

}
