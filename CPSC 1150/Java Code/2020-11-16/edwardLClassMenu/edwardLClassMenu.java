/** Program Name: edwardLClassMenu
* Student Name: Edward Lu
* Student Number:  100359822
* Date Last Written: November 4, 2020
* Course: CPSC 1150-W04
* Compiler: JDK 14
* Purpose: This program will take in a student's name and display their record, calculate a class's final exam average, find the student with the highest score, */

import java.util.*;
import java.io.*;

public class edwardLClassMenu
{
	public static void main(String[] args) throws IOException
	{
		//Creating a Scanner object and a variable for user input
		Scanner input = new Scanner(System.in);
		int number;
		
		//Displaying the menu and asking the user to choose an option
		System.out.println("Please enter:");
		System.out.println("1. To display a specific student's record.");
		System.out.println("2. To calculate the final exam average.");
		System.out.println("3. To find a student with the highest score on the final exam.");
		System.out.println("4. To copy the students' record to another file.");
		System.out.println("5. To terminate the program.\n");
		number = input.nextInt();
		
		//Using a switch statement to choose methods to execute
		switch (number) {
			case 1:
				studentRecord();
				break;
			case 2:
				examAverage();
				break;
			case 3:
				highestScore();
				break;
			case 4:
				copyRecords();
				break;
			case 5:
				System.exit(0);
		
		}
	}
	public static void studentRecord() throws IOException {
		//Creating variables and reading the classlist file
		Scanner input = new Scanner(System.in);
		String studentName, records = "";
		
		System.out.println("Please enter the student's name:");
		studentName = input.nextLine();
		
		File myFile = new File("classList.txt");
		Scanner inFile = new Scanner(myFile);
		
		String nextLine, thisLine = "";
		
		/*Creates a while loop that searches for the user-inputted
		  *student name and prints out that student's info*/
		while (inFile.hasNextLine()) {
			nextLine = inFile.nextLine();
			if (nextLine.contains(studentName)) {
				thisLine = nextLine;
			}
		}
		if (thisLine == "") {
			System.out.println("No Match.");
		}
		else {
			String[] studentInfo = thisLine.split(":");
			System.out.println("\nName: " + studentInfo[0]);
			System.out.println("ID: " + studentInfo[1]);
			System.out.println("Final: " + studentInfo[2]);
		}
	}
	public static void examAverage() throws IOException {
		//Creating variables and reading the classlist file
		Scanner input = new Scanner(System.in);
		File myFile = new File("classList.txt");
		Scanner inFile = new Scanner(myFile);
		String nextLine, marks = "";
		int temp = 0, totalMark = 0, numberOfMarks = 0;
		
		/*Creating a while loop that adds all integer marks together and counts how many there are
		  *so the program can calculate the average*/
		while (inFile.hasNextLine()) {
			boolean integer = true;
			nextLine = inFile.nextLine();
			if (!nextLine.isEmpty()) {
				String[] studentInfo = nextLine.split(":");
				try {
					temp = Integer.parseInt(studentInfo[2]);
				} catch (NumberFormatException e) {
					integer = false;
				}
				if (integer) {
					totalMark+=temp;
					numberOfMarks++;
				}
			}
		}
		//Rounding and printing the final exam average
		double finalMark = Math.round(((double) totalMark / (double) numberOfMarks) * 100000);
		System.out.println("The final exam average is " + (finalMark/100000) + "%.");
	}
	public static void highestScore() throws IOException {
		//Creating variables and reading the classlist file
		Scanner input = new Scanner(System.in);
		File myFile = new File("classList.txt");
		Scanner inFile = new Scanner(myFile);
		String nextLine, marks = "", tempStudentName = null, currentStudentName = null;
		int tempHighestScore = 0, totalMark = 0, currentHighestScore = 0, currentID = 0, tempID = 0;
		
		/*Creating a while loop to find the student with the highest score and their info*/
		while (inFile.hasNextLine()) {
			boolean integer = true;
			nextLine = inFile.nextLine();
			if (!nextLine.isEmpty()) {
				String[] studentInfo = nextLine.split(":");
				try {
					tempStudentName = studentInfo[1];
					tempID = Integer.parseInt(studentInfo[0]);
					tempHighestScore = Integer.parseInt(studentInfo[2]);
				} catch (NumberFormatException e) {
					integer = false;
				}
				if (integer) {
					if (tempHighestScore > currentHighestScore) {
						currentStudentName = tempStudentName;
						currentID = tempID;
						currentHighestScore = tempHighestScore;
					}
				}
			}
		}
		System.out.println("The student with the highest score in the final exam:");
		System.out.println("Name: " + currentStudentName);
		System.out.println("ID: " + currentID);
		System.out.println("Final Exam Score: " + currentHighestScore + "%");
	}
	public static void copyRecords() throws IOException {
		//Creating variables, reading the classlist file, and asking the user to input the new file's name
		Scanner input = new Scanner(System.in);
		String newFileName = input.nextLine();
		File myFile = new File("classList.txt"), newFile = new File(newFileName);
		Scanner inFile = new Scanner(myFile);
		FileWriter writer = new FileWriter(newFile);
		
		//Writing to the new file
		while (inFile.hasNextLine()) {
			writer.write(inFile.nextLine());
		}
		writer.close();
	}
}