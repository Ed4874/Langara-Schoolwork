/** Program Name: edwardLTrianglePrinter
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: October 3, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program was written to create a triangle of numbers using sequential increments until it reaches the input number*/

import java.util.*;

public class edwardLTrianglePrinter
{
	public static void main(String[] args)
	{
		//Declaring variables
		int target, count;
		String pyramid = "", stringCount;
		boolean x = true;
		
		//Program asks for user input
		System.out.println("Enter a number between 1-10	: ");
		
		//This do-while statement will turn off as soon as the for loop's count equals the user's input
		do {
			Scanner input = new Scanner(System.in);
			target = input.nextInt();
			switch (target) {
				default:
					System.out.println("Invalid Input; Input must be between 1-9");
					break;
				//For all integer inputs between 1-9, creates a loop that concatenates and print each count value to a string to create a pyramid
				case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
					for (count = 1; count <= target; count++) {
						stringCount = Integer.toString(count);
						pyramid = pyramid.concat(stringCount);
						System.out.println(pyramid);
						//Breaks the loop once the count equals target
						if (count == target) {
							x = false;
						}	
					}
			}
		} while (x == true);
	}
}