/*Student Name: Edward Lu
*Student Number: 100359822
*Date Written: December 7, 2020
*Class: CPSC 1150-W08
*JDK Version: 14
*Program Name: edwardL
*Purpose: This program will write a Fibonacci series with a user inputted length.*/

import java.util.*;

public class edwardLFibonacciNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive integer:");
		int number = input.nextInt();
		
		fibonacciMaker(number);
	}
	public static void fibonacciMaker(int number)
	{
		int[] array = new int[number];
		array[0] = 0;
		array[1] = 1;
		
		for (int i = 2; i < number; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < number; i++) {
			twosPower(array[i]);
		}
	}
	public static void twosPower(int number)
	{
		if (number == 0) {
			System.out.println(number + " is not a two's power");
			return;
		}
		
		int n = number;
		
		while (n != 1) { 
			if (n % 2 != 0) {
				System.out.println(number + " is not a two's power");
				return;
			}
			n = n / 2;
		}
		System.out.println(number + " is a two's power");
		return;
	}
}