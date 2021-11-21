import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bank firstBankOfJava;

        File f = new File("bank.dat");
        if (f.exists()) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            firstBankOfJava = (Bank) in.readObject();
            in.close();
        }
        else {
            firstBankOfJava = new Bank();
            firstBankOfJava.addAccount(new BankAccount(1001, 20000));
            firstBankOfJava.addAccount(new BankAccount(1015, 10000));
        }
        // Deposit money
        BankAccount a = firstBankOfJava.find(1001);
        a.deposit(100);
        System.out.println(a.getAccountNumber() + " : " + a.getBalance());

        a = firstBankOfJava.find(1015);
        System.out.println(a.getAccountNumber() + " : " + a.getBalance());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(firstBankOfJava);
        out.close();
    }
}
