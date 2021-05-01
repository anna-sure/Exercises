package Sat_0501.encap;

public class Computer {

    private String cpu;
    private int memory;
    private int disk;

    public Computer(){} //無參建構子這樣寫成一行比較好閱讀

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){ //返回詳細信息 也可以用void返回 方法內用sout列印出來
        return "cpu = "+cpu+" memory = "+memory + " disk = "+disk;
    }



    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
