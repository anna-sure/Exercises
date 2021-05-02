package Sun_0502.homework08;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) { // 每次存取款都 -1 dollar
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1); //此處取款要取款 + 1
    }
}
