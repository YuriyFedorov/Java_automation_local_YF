package Balance;

//      Create BankAccount class which contains:
//        an instance variable named balance of type double
//        constructor that sets the balance
//        method named withdraw which takes a parameter of type double representing the amount to withdraw.
//        and throw a custom NegativeBalanceException if the required amount to withdraw is greater than the balance.
//
//        Note! the new custom NegativeBalanceException should include a meaningful error message.
//
//        Create a program and test BankAccount balance & withdraw flows.


/**
 * Created by yuriyf on 11/8/2016.
 */
public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
