/** Program Name: edwardLTrianglePerimeterFinder
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: October 8, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program was written to find the perimeter of a triangle using user-inputted coordinates.*/

import java.util.*;

public class edwardLTrianglePerimeterFinder
{
	public static void main(String[] args)
	{
		//Declaring variables
		int x1, x2, x3, y1, y2, y3, l1, l2, l3;
		//String pyramid = "", stringCount;
		boolean x = true;
		
		do {
			//Taking in user-inputted coordinates
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the x-coordinate of point1: ");
			x1 = input.nextInt();
			System.out.println("Please enter the y-coordinate of point1:  ");
			y1 = input.nextInt();
			System.out.println("Please enter the x-coordinate of point2: ");
			x2 = input.nextInt();
			System.out.println("Please enter the y-coordinate of point2: ");
			y2 = input.nextInt();
			System.out.println("Please enter the x-coordinate of point3:  ");
			x3 = input.nextInt();
			System.out.println("Please enter the y-coordinate of point3: ");
			y3 = input.nextInt();
			
			l1 = Math.sqrt(Math.pow(x2-x1) + Math.pow(y2-y1));
			l2 = Math.sqrt(Math.pow(x3-x2) + Math.pow(y3-y2));
			l3 = Math.sqrt(Math.pow(x1-x3) + Math.pow(y1-y3));
			
		} while (x == true);
	}
}