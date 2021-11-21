import java.io.*;

public class BankAccount implements Serializable {
    private int acctNumber;
    private double balance;

    public BankAccount(int acctNum, double initBalance) {
        acctNumber = acctNum;
        balance = initBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return acctNumber;
    }
}
