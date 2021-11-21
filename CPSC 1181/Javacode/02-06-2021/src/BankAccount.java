public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int anAccountNumber){
            balance = 0;
        try {
            String stringAccount = String.valueOf(anAccountNumber);
            if (stringAccount.length() != 4) {
                throw new BankAccountException();
            }
            else {
                accountNumber = anAccountNumber;
            }
        } catch (BankAccountException e) {
            System.out.println("The account number is not a 4-digit number");
        }
    }

    public BankAccount(int anAccountNumber, double initialBalance) {
        try {
            if (initialBalance < 0) {
                throw new BankAccountException();
            }
            else {
                balance = initialBalance;
            }
        } catch (BankAccountException e) {
            System.out.println("initialBalance should be zero or greater.");
        }
        try {
            String stringAccount = String.valueOf(anAccountNumber);
            if (stringAccount.length() != 4) {
                throw new BankAccountException();
            }
            else {
                accountNumber = anAccountNumber;
            }
        } catch (BankAccountException d) {
            System.out.println("The account number is not a 4-digit number");
        }
    }

    public double getBalance() {

        return balance;
    }

    public int getAccountNumber(){

        return accountNumber;
    }

    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount){

        balance -= amount;
    }

    @Override
    public String toString(){

        return "Account Number: " + accountNumber + "  balance: " + balance;
    }
}
