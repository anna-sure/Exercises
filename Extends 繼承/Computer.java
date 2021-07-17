package Extends;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    //有参构造器
    //【小结一下：构造器、setget和方法的区别】
    //构造器必须与类名同名 无返回值 用于新对象的初始化
    //get set大写首字母前就是get set
    //方法可以有返回值、形参，也有自己的名字
    public Computer(String cpu,int memory,int disk){
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回computer详细信息
    public String getDetails(){
        return "cpu=" + cpu + "memory =" + memory + "disk=" + disk;
    }

    //set get
    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public String getCpu(){
        return cpu;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public int getMemory(){
        return memory;
    }

    public void setDisk(int disk){
        this.disk = disk;
    }

    public int getDisk(){
        return disk;
    }

}
