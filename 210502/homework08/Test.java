package Sun_0502.homework08;

public class Test {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance()); //1300

        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1399

        //月初，定時器自動調用一下 earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

    }

}
