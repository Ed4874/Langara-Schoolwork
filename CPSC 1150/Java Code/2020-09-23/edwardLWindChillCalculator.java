/** Program Name: edwardLWindChillCalculator
* Student Name: Edward Lu
* Student Number:  100359822
* Date Written: September 23, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program was written to calculate wind-chill using the formula T_wc = 13.112 + 0.6215 T_a -11.37 V^0.16 + 0.3965 T_a V^0.16.*/

import java.util.*;

public class edwardLWindChillCalculator
{
	public static void main(String[] args)
	{
		double ta, velocity;
		System.out.println("Enter the ambient air temperature in Celsius: ");
		while (true) {
			Scanner input = new Scanner(System.in);
			ta = input.nextDouble();
			if (-50 <= ta && ta <= 5) {
				break;
			}
			else if (-50 > ta || ta > 5){
				System.out.println("Temperature is out of range. Please enter a valid value.");
			}
		}
		System.out.println("Enter the wind speed in km/h: ");
		while (true) {
			Scanner input = new Scanner(System.in);
			velocity = input.nextDouble();
			if (0 <= velocity && velocity <= 100) {
				break;
			}
			else if (0 > velocity || velocity > 100) {
				System.out.println("Wind speed is out of range. Please enter a valid value.");
			}
		}
	double twc = 13.122 + (0.6215*ta) - (11.37*Math.pow(velocity, 0.16)) + (0.3965*ta*Math.pow(velocity, 0.16));
	twc = Math.round(twc * 100);
	System.out.println("The wind chill index is " + (twc /100) + " degrees Celsius");
	}
}
			