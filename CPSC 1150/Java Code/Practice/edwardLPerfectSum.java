/*Student Name: Edward Lu
*Student Number: 100359822
*Date Written: November 27, 2020
*Class: CPSC 1150-W08
*JDK Version: 14
*Program Name: edwardLPerfectSum
*Purpose: This program will read a two string inputs of a positive integer and check whether 
*it is less than 40 characters long or if it is not all digits.*/

import java.util.*;

public class edwardLPerfectSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive integer number");
		int number = input.nextInt();
		
		if (number <= 0) {
			System.out.println(number + " is not a positive integer. Please enter a postive integer.");
			main(null);
		}
		
		int one = 1, two = number-1;
		
		for (int i = 1; i < number; i++) {
			if ((Math.pow((double)((int)Math.sqrt(one)), 2)) + (Math.pow((double)((int)Math.sqrt(two)), 2)) == number) {
				System.out.println(number + " is the sum of the perfect squares " + one + " and " + two + ".");
				System.exit(0);
			}
			else {
				one++;
				two--;
			}
		}
		
		System.out.println(number + " is not the sum of two perfect squares.");
		main(null);
	}
}
			
		
		