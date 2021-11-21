/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: February 1, 2021
 *JDK Version: 14
 *Purpose: This program will utilize the College and Student classes to manage a database of students.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CollegeTester {
    public static void main (String[] args)
    {
        //Initiating variables and adding a few students
        College Langara = new College();
        Scanner input = new Scanner(System.in);
        int studentNumber = 0;
        Langara.addStudent(new Student("Edward Lu", "1234 Random Street, Vancouver, BC"));
        Langara.addStudent(new Student("Robert McDonald", "9876 RNG Road, Richmond, BC"));
        Langara.addStudentCredit(10001, 3.00, 11.10);
        Langara.addStudentCredit(10002, 4.00, 11.10);

        //Try will run the main chunk of the program and catch any errors.
        try {
            //While loop will allow the program to keep running until specified otherwise
            while (true) {
                //These will present a menu for the user to choose from. The user will then enter their selection
                System.out.println("Would you like to:");
                System.out.println("1. Add a new student to the college?");
                System.out.println("2. Display an existing student based on the student number?");
                System.out.println("3. Delete a student from the college using the student number?");
                System.out.println("4. Add the Grade Point Value and Credits earned for a course taken by an existing student?");
                System.out.println("5. Retrieve the login ID for an existing student using their student number?");
                System.out.println("6. Find the student with the highest GPA?");
                System.out.println("7. Exit program?");
                int option = input.nextInt();

                //This switch statement will take the user's menu input and run the appropriate code
                switch (option) {
                    //Case 1 will ask for the new student's name and address in order to add them to the college
                    case 1:
                        String studentName, studentAddress;
                        System.out.println("What is the new student's name?");
                        studentName = input.nextLine();
                        input.nextLine();
                        System.out.println("What is the new student's address?");
                        studentAddress = input.nextLine();
                        Langara.addStudent(new Student(studentName, studentAddress));
                        System.out.println("Student added.");
                        System.out.println(Langara);
                        break;
                    //Case 2 will ask for a student's number and output that student's name.
                    case 2:
                        System.out.println("What is the student number of the student you wish to view?");
                        studentNumber = input.nextInt();
                        System.out.println("The name of the student you wish to view is " + Langara.viewStudent(studentNumber));
                        System.out.println(Langara);
                        break;
                    //Case 3 will ask for the student's number and remove the specified student accordingly
                    case 3:
                        System.out.println("What is the number of the student you wish to remove?");
                        studentNumber = input.nextInt();
                        Langara.removeStudent(studentNumber);
                        System.out.println("Student removed.");
                        break;
                    //Case 4 will ask for the student's student number, grade point value, and credits in order to add them to their account
                    case 4:
                        System.out.println("Please enter the student's student number.");
                        studentNumber = input.nextInt();
                        System.out.println("Please enter the value you wish to add to the student's grade point value");
                        double gpv = input.nextDouble();
                        System.out.println("Please enter the number of credits you wish to add to this student.");
                        double credits = input.nextDouble();
                        Langara.addStudentCredit(studentNumber, gpv, credits);
                        break;
                    //Case 5 will generate the student's login ID using their student number and their name
                    case 5:
                        System.out.println("Please enter the student's student number.");
                        studentNumber = input.nextInt();
                        String resultLoginID = Langara.getLoginID(studentNumber);
                        if (resultLoginID == "") {
                            System.out.println("Sorry, there is no student with that student number.");
                        }
                        else {
                            System.out.println(Langara.getLoginID(studentNumber));
                        }
                        break;
                    //Case 6 will print out the student with the highest GPA value
                    case 6:
                        String result = Langara.getHighestGPA();
                        System.out.println("The student with the highest GPA is " + result);
                        break;
                    //Case 7 is used to exit the program if the user so chooses
                    case 7:
                        System.exit(0);
                        break;
                    //Default will detect if the user inputted an option not listed above and tell them accordingly without displaying an error.
                    default:
                        System.out.println("Sorry, that's not a valid input.");
                        break;
                }
                //This part of the program will ask the user if they wish to continue running the program or quit.
                //By default it will continue running until the user provides a satisfactory response.
                System.out.println("Do you wish to exit the program?");
                String answer = input.next();
                switch (answer) {
                    case "N", "no", "No", "n":
                        continue;
                    case "Y", "Yes", "yes", "y":
                        System.exit(0);
                    default:
                        System.out.println("Unknown response. Program will continue.\n");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Sorry, that's not a valid input.");
        }
    }
}
