/** Program Name: edwardLDataFiles
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: December 7, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will read a data file and print a subsequence of numbers*/

import java.util.*;
import java.io.*;

public class edwardLDataFiles
{
	public static void main(String[] args) throws IOException
	{
		File myFile = new File("testfile1.txt");
		Scanner inFile = new Scanner(myFile);
		
		String nextLine, thisLine = "";
		
		while (inFile.hasNextLine()) {
			nextLine = inFile.nextLine();
			if (nextLine.contains("ADC") && nextLine.contains("CAA")) {
				thisLine = nextLine;
				String[] dataLine = thisLine.split(" ");
				int start = dataLine[1].indexOf("ADC");
				int end = dataLine[1].indexOf("CAA");
				if (start+3 <= end) {
					System.out.println(dataLine[0] + " " + dataLine[1].substring(start+3, end));
				}
				else {
					System.out.println(dataLine[0] + " " + "No important sequence found");
				}
				//System.out.println(dataLine[1].indexOf("CAA"));
				
				//if (!(characters[1].contains("CAA"))) {
					//System.out.println(characters[1] + "\n");
					//System.out.println("No important sequence found");
					//continue;
				//}
				//~ else {
					//~ String[] finalCharacters = characters[1].split("CAA");
					//~ System.out.println(finalCharacters[0]);
				//~ }
			}
			else {
				thisLine = nextLine;
				String[] dataLine = thisLine.split(" ");
				System.out.println(dataLine[0] + " " + "No important sequence found");
			}
		}
	}
}