/** Program Name: edwardLSquarePrinter
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: October 3, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will print out all squares with values less than or equal to the input.*/

import java.util.*;

public class edwardLSquarePrinter
{
	public static void main(String[] args)
	{
		//Declaring variables
		int number, square, count;
		String output = "", stringCount;
		
		//Taking in user input
		System.out.println("Enter a positive integer: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		//If statement will determine whether the user input is positive or not
		if (number > 0) {
			//This loop will square the count by one each cycle until the square becomes greater than the input, then convert the answer into a string
			for (count = 0; (int) Math.pow(count, 2) < number; count++) {
				stringCount = Integer.toString((int) Math.pow(count, 2));
				output = output.concat(stringCount + " ");
			}
		}
		else {
			System.out.println("Invalid Input; Must be greater than 0");
		}
	//Prints out the final results
	System.out.println(output);
	}
}