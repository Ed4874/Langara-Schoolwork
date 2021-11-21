/** Program Name: edwardLMonthDisplayer
* Student Name: Edward Lu
* Student Number:  100359822
* Date Written: October 1, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program was written to display the corresponding month according to the input, unless the input equals 0, where then the program will terminate*/

import java.util.*;

public class edwardLMonthDisplayer
{
	public static void main(String[] args)
	{
		int month;
		boolean x = true;
		System.out.println("Enter a number between 1 - 12, enter 0 to terminate: ");
		do {
			Scanner input = new Scanner(System.in);
			month = input.nextInt();
			switch (month) {
				case 0:
					System.out.println("Program Terminating");
					x = false;
					break;
				case 1:
					System.out.println("January");
					continue;
				case 2:
					System.out.println("February");
					continue;
				case 3:
					System.out.println("March");
					continue;
				case 4:
					System.out.println("April");
					continue;
				case 5:
					System.out.println("May");
					continue;
				case 6:
					System.out.println("June");
					continue;
				case 7:
					System.out.println("July");
					continue;
				case 8:
					System.out.println("August");
					continue;
				case 9:
					System.out.println("September");
					continue;
				case 10:
					System.out.println("October");
					continue;
				case 11:
					System.out.println("November");
					continue;
				case 12:
					System.out.println("December");
					continue;
				default:
					System.out.println("Invalid Month");
					continue;
			}
		} while (x == true);
	}
}