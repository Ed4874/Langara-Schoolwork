/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 15, 2021
 *JDK Version: 14
 *Purpose: This program will test the Fraction Class we created for Lab2.*/

import java.util.Scanner;

public class TestFractions {
    public static void main (String[] args) {

        Fraction f1, f2, f3;
        int num1, den1, num2, den2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numerator of your first fraction");
        num1 = input.nextInt();
        System.out.println("Please enter the denominator of your first fraction");
        den1 = input.nextInt();
        System.out.println("Please enter the numerator of your second fraction");
        num2 = input.nextInt();
        System.out.println("Please enter the denominator of your second fraction");
        den2 = input.nextInt();

        f1 = new Fraction(num1, den1);
        f2 = new Fraction(num2, den2);
        f3 = new Fraction();

        Fraction res1 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + res1);
        Fraction res2 = f2.add(f1);
        System.out.println(f2 + " + " + f1 + " = " + res2);
        Fraction res3 = f1.subtract(f2);
        System.out.println(f1 + " - " + f2 + " = " + res3);
        Fraction res4 = f2.subtract(f1);
        System.out.println(f2 + " - " + f1 + " = " + res4);
        Fraction res5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + res5);
        Fraction res6 = f2.multiply(f1);
        System.out.println(f2 + " * " + f1 + " = " + res6 + "\n");

        System.out.println("Default Parameters for Fraction() is " + f3);
    }
}
