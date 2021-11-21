/** Program Name: edwardLDivisibilityChecker
* Student Name: Edward Lu
* Student Number:  100359822
* Date Written: September 23, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program was written to calculate wind-chill using the formula T_wc = 13.112 + 0.6215 T_a -11.37 V^0.16 + 0.3965 T_a V^0.16.*/

import java.util.*;

public class edwardLDivisibilityChecker
{
	public static void main(String[] args)
	{
		int num1, num2, result;
		System.out.println("Enter the first positive integer: ");
		while (true) {
			Scanner input = new Scanner(System.in);
			num1 = input.nextInt();
			if (0 <= num1) {
				break;
			}
			else if (0 > num1) {
				System.out.println("Input cannot be negative. Please enter a valid value.");
			}
		}
		System.out.println("Enter the second positive integer: ");
		while (true) {
			Scanner input = new Scanner(System.in);
			num2 = input.nextInt();
			if (0 <= num2) {
				break;
			}
			else if (0 > num2) {
				System.out.println("Input cannot be negative. Please enter a valid value.");
			}
		}
	if (num2 > num1) {
		System.out.println("Second input cannot be larger than first input. Please enter a valid value.");
	}
	result = num1 % num2;
	else if (result > 0) {
		System.out.println(num1 + " is not divisible by " + num2);
	}
	else if (result == 0) {
		System.out.println(num1 + " is divisible by " + num2);
	}
	}
}
			