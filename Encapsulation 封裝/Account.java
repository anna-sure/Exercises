package Encapsulation;

public class Account {
    private String name;
    private double balance;
    private String pwd;


    //提供两个构造器
    public Account(){

    }

    public Account(String name, double balance, String pwd){
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    //set（对象）方法用于对属性判断并赋值
    //public void setXxx(数据类型 参数名){}
    //set方法没有返回值，因为作用只是赋值
    //set + 首字母大写
    //一定有参数，因为需要传进参数值
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name rang is 2-4");
            this.name = "noname";
        }
    }

     //get方法用于获取属性的值，没有get方法就无法取出set方法的赋值，必须配套使用
    //public (返回的)数据类型 getXxx(){}
    //一定有返回值，因为取值作用
    //不需要参数传入
    //这个对象方法的实现就是直接将属性的值返回
    public String getName(){
        return name;
    }

    public void setBalance (double balance){
        if(balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("balance need above 20");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setPwd(String pwd){
        if(pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("pwd need have 6 codes");
            this.pwd = "000000";
        }
    }

    public String getPwd(){
        return pwd;
    }

   public void showInfo(){
        //此处可以增加权限的校验 合法才可以调验
        System.out.println("Account's info: name = " + name + " balance = " + balance + " pwd = " + pwd);
   }


    }


