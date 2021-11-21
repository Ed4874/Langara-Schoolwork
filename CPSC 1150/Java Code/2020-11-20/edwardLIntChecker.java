/**Student Name: Edward Lu
*Student Number: 100359822
*Date Written: November 20, 2020
*Class: CPSC 1150-W08
*JDK Version: 14
*Program Name: edwardLIntChecker
*Purpose: This program will read a string input of a positive integer and check whether 
*it is less than 40 characters long or if it is not all digits.*/

import java.util.*;

public class edwardLIntChecker
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		
		if (checkLength(number)) {
			if (checkNumber(number)) {
				System.out.println("Your input is correct.");
			}
			else {
				System.out.println("Your input is incorrect.\nExpecting all digit characters.");
			}
		}
		else {
			System.out.println("Your input is incorrect.\nExpecting up to 40 digit number.");
			if (!(checkNumber(number))) {
				System.out.println("Expecting all digit characters.");
			}
		}
	}
	public static boolean checkLength(String number)
	{
		boolean fortyOrLess = false;
		if (number.length() <= 40) {
			fortyOrLess = true;
		}
		else {
			fortyOrLess = false;
		}
		return fortyOrLess;
	}
	public static boolean checkNumber(String number)										
	{
		boolean numbersAreDigits = true;
		
		for (int i = 0; i < number.length(); i++) {
			if (Character.isDigit(number.charAt(i))) {
				continue;
			}
			else {
				numbersAreDigits = false;
				break;
			}
		}
		return numbersAreDigits;
	}
}
			
		