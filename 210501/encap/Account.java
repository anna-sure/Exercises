package Sat_0501.encap;

public class Account {

    private String name;
    private double balance;
    private String pwd;


    public Account() {
    }

    public Account(String name, int money, String pwd) {
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("輸入有誤，字符在2-6個之間");
            this.name = "無名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("餘額必須大於20，默認為0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密碼必須是6位數字,默認為 000000");
            this.pwd = "000000";

        }
    }

    public void info(){ //此處不用寫參數！
        System.out.println("name = "+name+" balance = "+balance +" pwd = "+pwd);
    }

}

