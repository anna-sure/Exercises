package Sun_0502.homework08;

public class SavingsAccount extends BankAccount {

    private int count = 3;
    private double rate = 0.01;//利率

    public SavingsAccount(double initialBalance) { //count和rate不給建構子，通過set改初始值
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        //判斷是否還可以免手續費，每月三次
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    //每月初，統計上個月的利息，同時初始count = 3，每月有三次免手續費
    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);//調父類存款方法來累積每月利息
    }
}
