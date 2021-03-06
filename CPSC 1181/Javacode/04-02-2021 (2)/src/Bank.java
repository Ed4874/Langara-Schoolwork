import java.util.ArrayList;
import java.io.*;

public class Bank implements Serializable{
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount a) {
        accounts.add(a);
    }

    public double getTotalBalance() {
        double total = 0;
        for (BankAccount a : accounts)
            total = total + a.getBalance();

        return total;
    }

    public int count(double atLeast) {
        int matches = 0;
        for (BankAccount a : accounts)
            if (a.getBalance() >= atLeast)
                matches++;

        return matches;
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount a : accounts)
            if (a.getAccountNumber() == accountNumber) // Found a match
                return a;

        return null;
    }

    public BankAccount getMaximum() {
        if (accounts.size() == 0)
            return null;

        BankAccount largest = accounts.get(0);
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount a = accounts.get(i);
            if (a.getBalance() > largest.getBalance())
                largest = a;
        }

        return largest;
    }
}
