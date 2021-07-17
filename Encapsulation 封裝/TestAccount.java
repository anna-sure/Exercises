package Encapsulation;

public class TestAccount {
    public static void main(String[] args){
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(600);
        account.setPwd("123456");

        account.showInfo();

    }
}
