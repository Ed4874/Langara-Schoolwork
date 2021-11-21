/*Student Name: Edward Lu
* Student Number: 100359822
* Date Due: February 9, 2021
* JDK Version: 14
* Purpose: This program will test the Bank Account and Bank classes.
* */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class BankTester {
    public static void main (String[] args) {
        Bank CIBC = new Bank();
        Scanner input = new Scanner(System.in);
        try {
            //While loop will allow the program to keep running until specified otherwise
            while (true) {
                //These will present a menu for the user to choose from. The user will then enter their selection
                System.out.println("Would you like to:");
                System.out.println("1. Create a new Bank Account?");
                System.out.println("2. Get the balance of a BankAccount based on the account number?");
                System.out.println("3. Deposit money to an existing BankAccount?");
                System.out.println("4. Withdraw money from an existing BankAccount?");
                System.out.println("5. Find a BankAccount with the highest balance?");
                System.out.println("6. Find a BankAccount with the lowest balance?");
                System.out.println("7. Exit program?");
                int option = input.nextInt();

                //Switch statement will take the user input and call the appropriate method.
                switch (option) {
                    case 1:
                        addBankAccount(CIBC);
                        break;
                    case 2:
                        getBalance(CIBC);
                        break;
                    case 3:
                        deposit(CIBC);
                        break;
                    case 4:
                        withdraw(CIBC);
                        break;
                    case 5:
                        findHighestBalance(CIBC);
                        break;
                    case 6:
                        findLowestBalance(CIBC);
                        break;
                    //Case 7 is used to exit the program if the user so chooses
                    case 7:
                        System.exit(0);
                        break;
                    //Default will detect if the user inputted an option not listed above and tell them accordingly without displaying an error.
                    default:
                        System.out.println("Sorry, that's not a valid input.");
                        break;
                }
                //This part of the program will ask the user if they wish to continue running the program or quit.
                //By default it will continue running until the user provides a satisfactory response.
                System.out.println("Do you wish to exit the program?");
                String answer = input.next();
                switch (answer) {
                    case "N", "no", "No", "n":
                        continue;
                    case "Y", "Yes", "yes", "y":
                        System.exit(0);
                    default:
                        System.out.println("Unknown response. Program will continue.\n");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Sorry, that's not a valid input.");
        }
    }
    //All methods will take the Bank object as a parameter.

    //addBankAccount allows the user to create a new Bank account.
    public static void addBankAccount(Bank CIBC) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a new account number");
        int number = input.nextInt();
        System.out.println("Please enter this account's initial balance");
        double initialBalance = input.nextInt();
        CIBC.addAccount(new BankAccount(number, initialBalance));
    }
    //getBalance will print the appropriate bank account along with its balance
    public static void getBalance(Bank CIBC) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the account number");
        int number = input.nextInt();
        System.out.println(CIBC.find(number));
    }
    //withdraw will ask the user for a bank account number and a withdraw amount, and withdraw that number from said account
    public static void withdraw(Bank CIBC) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the account number");
        int number = input.nextInt();
        System.out.println("Please enter the amount you wish to withdraw");
        double withdrawAmount = input.nextInt();
        CIBC.withdraw(number, withdrawAmount);
        System.out.println(CIBC.find(number));
    }
    //deposit will ask the user for a bank account number and a deposit amount, and deposit that number into said account
    public static void deposit(Bank CIBC) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the account number");
        int number = input.nextInt();
        System.out.println("Please enter the amount you wish to deposit");
        double depositAmount = input.nextInt();
        CIBC.deposit(number, depositAmount);
        System.out.println(CIBC.find(number));
    }
    //findHighestBalance will call the getMaximum method in the Bank Class, and print out the account with the highest balance
    public static void findHighestBalance(Bank CIBC) {
        System.out.println(CIBC.getMaximum());
    }
    //findLowestBalance will call the getMinimum method in the Bank Class, and print out the account with the lowest balance
    public static void findLowestBalance(Bank CIBC) {
        System.out.println(CIBC.getMinimum());
    }
}
