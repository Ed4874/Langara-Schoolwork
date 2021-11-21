/*Student Name: Edward Lu
*Student Number: 100359822
*Date Written: December 8, 2020
*Class: CPSC 1150-W08
*JDK Version: 14
*Program Name: edwardLOrdinalForms
*Purpose: This program will write append the ordinal forms onto inputted numbers.*/

import java.util.*;

public class edwardLOrdinalForms
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many numbers you wish to input:");
		int length = input.nextInt();
		int[] array = new int[length];
		System.out.println("\nPlease enter your numbers:");
		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		String[] newArray = new String[length];
		
		for (int i = 0; i < length; i++) {
			ordinalAppender(array[i]);
		}
	}
	public static String ordinalAppender(int n) {
		n
	}
}