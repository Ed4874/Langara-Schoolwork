/** Program Name: edwardLStockPrices
* Author: Edward Lu
* Student Number: 100359822
* Date Written: September 17, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will take in stock prices, number of shares, and commission rate in order to calculate the total value of shares, commission, and net proceeds.*/

import java.util.*;

public class edwardLStockPrices
{
	public static void main(String[] args)
	{
		//Declaring variables
		double stockPrice, rate, valueOfShares, commission, netProceeds;
		int numberOfShares;
		
		//Taking user input for stock prices, number of shares, and commission rate
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the stock price: ");
		stockPrice = input.nextDouble();
		System.out.println("Enter the number of shares being sold: ");
		numberOfShares = input.nextInt();
		System.out.println("Enter the commission rate as a percentage: ");
		rate = input.nextDouble();
		
		//Calculating value of share, commission, and net proceeds
		valueOfShares = stockPrice * numberOfShares;
		commission = valueOfShares * (rate / 100);
		netProceeds = valueOfShares - commission;
		netProceeds = Math.round(netProceeds * 100);
		commission = Math.round(commission * 100);
		
		//Displaying results
		System.out.println("Value of Shares: " + valueOfShares);
		System.out.println("Commission: " + commission / 100);
		System.out.println("Net Proceeds: " + netProceeds / 100);
	}
}