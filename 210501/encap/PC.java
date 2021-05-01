package Sat_0501.encap;

public class PC extends Computer{

    private String brand;

    //繼承的基本思想：父類的建構子完成父類屬性的初始化
    //子類的建構子完成子類屬性的初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void printInfo(){
//      System.out.println(getCpu()+getMemory()+getDisk()); //get到父類的私有屬性

        System.out.println(getDetails()+" brand =  "+brand);
        //用整合各種父類屬性的getDetails方法比上面更快
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
