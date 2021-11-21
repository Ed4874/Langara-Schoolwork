/*Student Name: Edward Lu
*Student Number: 100359822
*Date Written: November 27, 2020
*Class: CPSC 1150-W08
*JDK Version: 14
*Program Name: edwardLIntAdder
*Purpose: This program will read a two string inputs of a positive integer and check whether 
*it is less than 40 characters long or if it is not all digits.*/

/* Importing the java.util package*/
import java.util.*;

public class edwardLIntAdder
{
	public static void main(String[] args)
	{
		/*Taking in inputs and running them through the
		checkEverything method to make sure they fit the requirements*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		String numberOne = input.nextLine();
		checkEverything(numberOne);
		
		System.out.println("Please enter your second number");
		String numberTwo = input.nextLine();
		checkEverything(numberTwo);
		
		/*Running the method that will add the two numbers and
		output the answer*/
		addNumbers(numberOne, numberTwo);
	}
	public static void checkEverything(String number)
	{
		/*Using an if statement to run a method that will check if the length and
		characters fit the requirements*/ 
		if (checkLength(number)) {
			if (!(checkNumber(number))) {
				System.out.println("Your input is incorrect.\nExpecting all digit characters.");
				System.exit(0);
			}
		}	
		else {
			System.out.println("Your input is incorrect.\nExpecting up to 40 digit number.");
			if (!(checkNumber(number))) {
				System.out.println("Expecting all digit characters.");
				System.exit(0);
			}
		}
	}
	public static boolean checkLength(String number)
	{
		/*Checking if the string is within 40 characters 
		and using a boolean variable to output the result*/
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
		/*Checking if each character in the inputted string 
		is a number and using a boolean variable to output the result*/
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
	public static void addNumbers(String numberOne, String numberTwo)
	{
		/*Creating int variables that carry the length of the inputs */
		int lengthOne = numberOne.length();
		int lengthTwo = numberTwo.length();
		String number = "";
		
		/*Turning the input into arrays*/
		int[] firstArray = new int[lengthOne], secondArray = new int[lengthTwo];
		
		/*Reading each character, converting them into int values and
		adding them into the arrays*/
		for (int i = 0; i < lengthOne; i++) {
			char temp = numberOne.charAt(i);
			number = String.valueOf(temp);
			firstArray[i] = Integer.parseInt(number);
		}
		for (int i = 0; i < lengthTwo; i++) {
			char temp = numberTwo.charAt(i);
			number = String.valueOf(temp);
			secondArray[i] = Integer.parseInt(number);
		}
		/*If the first number is larger than or equal to the second number,
		the program will create a new array for each number with a length
		one greater than the larger number. It will also create a third array
		for the final result*/
		if (lengthOne >= lengthTwo) {
			int[] newFirstArray = new int[lengthOne+1];
			int[] newSecondArray = new int[lengthOne+1];
			int temp = 0, lengthTwoCount = 0, lengthOneCount = 0;
			
			for (int i = ((lengthOne + 1)  - lengthTwo); i < lengthOne+1; i++) {
				newSecondArray[i] = secondArray[lengthTwoCount];
				lengthTwoCount++;
			}
			/*Program will print out the first number with a plus symbol*/
			System.out.println(numberOne + " +");
			for (int i = ((lengthOne + 1)  - lengthOne); i < lengthOne+1; i++) {
				newFirstArray[i] = firstArray[lengthOneCount];
				lengthOneCount++;
			}
			/*Program will print out the second number and compensate for
			its shorter length by printing spaces for the difference in length*/
			System.out.println(" ".repeat(lengthOne-lengthTwo) + numberTwo);

			/* Program now adds each digit of the two numbers and adds the result
			to the third array. If the resulting value is greater than 10, this loop
			will add the extra digit to the next element in the array*/
			int[] thirdArray = new int[lengthOne+1];
			for (int i = 1; i < lengthOne+1; i++) {
				thirdArray[i] = newFirstArray[i] + newSecondArray[i];
			}
			for (int i = lengthOne; i >=0; i--) {
				if (thirdArray[i] >= 10) {
					thirdArray[i-1]+=1;
					thirdArray[i] = thirdArray[i] % 10;
				}
			}
			/*Printing out the final result*/
			String finalResult = Arrays.toString(thirdArray).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
			System.out.println("--".repeat(finalResult.length()));
			if (finalResult.charAt(0) == '0') {
				System.out.println(finalResult.substring(1));
			}
			else {
				System.out.println(finalResult);
			}
		}
		/*If the second number is larger than the first number,
		the program will create a new array for each number with a length
		one greater than the larger number. It will also create a third array
		for the final result*/
		if (lengthOne < lengthTwo) {
			int[] newFirstArray = new int[lengthTwo+1];
			int[] newSecondArray = new int[lengthTwo+1];
			int temp = 0, lengthTwoCount = 0, lengthOneCount = 0;
			for (int i = ((lengthTwo + 1)  - lengthTwo); i < lengthTwo+1; i++) {
				newSecondArray[i] = secondArray[lengthTwoCount];
				lengthTwoCount++;
			}
			/*Program will print out the first number with a plus symbol,
			as well as compensate for its shorter length by printing spaces*/
			System.out.println(" ".repeat(lengthTwo-lengthOne) + numberOne + " +");

			for (int i = ((lengthTwo + 1)  - lengthOne); i < lengthTwo+1; i++) {
				newFirstArray[i] = firstArray[lengthOneCount];
				lengthOneCount++;
			}
			/*Program will print out the second number*/
			System.out.println(numberTwo);
			
			/* Program now adds each digit of the two numbers and adds the result
			to the third array. If the resulting value is greater than 10, this loop
			will add the extra digit to the next element in the array*/
			int[] thirdArray = new int[lengthTwo+1];
			for (int i = 1; i < lengthTwo+1; i++) {
				thirdArray[i] = newFirstArray[i] + newSecondArray[i];
			}
			for (int i = lengthTwo; i >=0; i--) {
				if (thirdArray[i] >= 10) {
					thirdArray[i-1]+=1;
					thirdArray[i] = thirdArray[i] % 10;
				}
			}
			/*Printing out the final result*/
			String finalResult = Arrays.toString(thirdArray).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
			System.out.println("-".repeat(finalResult.length()));
			if (finalResult.charAt(0) == '0') {
				System.out.println(finalResult.substring(1));
			}
			else {
				System.out.println(finalResult);
			}
		}
	}
}
			
		