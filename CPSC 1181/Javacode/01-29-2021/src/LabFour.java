/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 29, 2021
 *JDK: 14
 *Purpose: This program will take in user inputted operations and calculate them without the user of if statements.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabFour {
    public static void main (String[] args) throws InputMismatchException, Exception {
        while (true) {
            Scanner input = new Scanner(System.in);
            int operandOne = 0;
            int operandTwo = 0;
            double result;
            String operator;
            try {
                System.out.println("Please enter your first operand.");
                operandOne = input.nextInt();
                System.out.println("Please enter your first operand.");
                operandTwo = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: You entered a non-integer.\n");
                continue;
            }
            System.out.println("Please enter an operator (+, -, *, /, %, q):");
            operator = input.next();
            try {
                switch (operator) {
                    case "+":
                        result = operandOne + operandTwo;
                        System.out.println(result);
                        break;
                    case "-":
                        result = operandOne - operandTwo;
                        System.out.println(result);
                        break;
                    case "*":
                        result = operandOne * operandTwo;
                        System.out.println(result);
                        break;
                    case "/":
                        result = ((double) operandOne) / ((double) operandTwo);
                        System.out.println(result);
                        break;
                    case "%":
                        result = ((double) operandOne) % ((double) operandTwo);
                        System.out.println(result);
                        break;
                    case "q":
                        System.exit(0);
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: You tried to divide by zero.\n");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("Operator must be +, -, *, /, or %.\n");
                continue;
            }
            System.out.println("Do you want to try again? (Y/N)");
            String restart = input.next();
            switch (restart) {
                case "Y": case "Yes":
                    continue;
                case "N": case "No":
                    System.exit(0);
                default:
                    System.out.println("Erroneous Input: Program will continue running until instructed to end.");
            }
        }
    }
}
