/** Program Name: edwardLIntegerSort
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: October 9, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will take in three inputs, sort them, and output the sorted result*/

import java.util.*;

public class edwardLIntegerSort
{
	public static void displaySortedNumbers(int num1, int num2, int num3)
	{
		int[] array = {num1, num2, num3};
		Arrays.sort(array);
		String output = Arrays.toString(array);
		System.out.println("Sorted Numbers: " + output.replace("[","").replace("]","").replace(",",""));
	}
	public static void main(String[] args)
	{
		int input1, input2, input3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integer numbers ");
		input1 = input.nextInt();
		input2 = input.nextInt();
		input3 = input.nextInt();
		displaySortedNumbers(input1, input2, input3);
	}
		
}