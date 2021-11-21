/* *Author: Edward Lu
* Student Number: 100359822
* Program Name: edwardLAreaCalculator
* Date Written: September 18, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will use radius and pi to calculate the area and volume of a cylinder.*/

import java.util.*;

public class edwardLAreaCalculator
{
	public static void main(String[] args)
	{
		double radius, area, volume;
		int length;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder: ");
		radius = input.nextDouble();
		System.out.println("Enter the length of the cylinder: ");
		length = input.nextInt();
		
		area = radius * radius * Math.PI;
		area = Math.round(area * 100);
		System.out.println("The area of the cylinder is: " + (area / 100));
		
		volume = (area / 100) * length;
		volume = Math.round(volume * 100);
		System.out.println("The volume of the cylinder is: " + (volume / 100));
	}
}