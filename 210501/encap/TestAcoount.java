package Sat_0501.encap;

public class TestAcoount {
    public static void main(String[] args) {


        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("999999");

        account.info();

    }
}
