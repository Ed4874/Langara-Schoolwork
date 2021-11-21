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
		double ax, ay, bx, by, cx, cy, bc, ac, ab, perimeter;
		String repeat = "";
		boolean x = true;
		
		do {
			//Taking in user-inputted coordinates
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the x-coordinate of point1: ");
			ax = input.nextDouble();
			System.out.println("Please enter the y-coordinate of point1:  ");
			ay = input.nextDouble();
			System.out.println("Please enter the x-coordinate of point2: ");
			bx = input.nextDouble();
			System.out.println("Please enter the y-coordinate of point2: ");
			by = input.nextDouble();
			System.out.println("Please enter the x-coordinate of point3:  ");
			cx = input.nextDouble();
			System.out.println("Please enter the y-coordinate of point3: ");
			cy = input.nextDouble();
			
			bc = Math.sqrt(Math.pow(bx-cx, 2) + Math.pow(by-cy, 2));
			ac = Math.sqrt(Math.pow(ax-cx, 2) + Math.pow(ay-cy, 2));
			ab = Math.sqrt(Math.pow(ax-bx, 2) + Math.pow(ay-by, 2));
			perimeter = Math.round((bc + ac + ab) * 100);
			System.out.println(perimeter/100);
			
			System.out.println("Would you like to repeat the program?");
			repeat = input.next();
			if (repeat == "yes" || repeat == "Yes") {
				continue;
			}
			else if (repeat == "no" || repeat == "No") {
				x = false;
			}
		} while (x == true);
	}
}