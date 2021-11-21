/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 23, 2021
*JDK Version: 14
 *Purpose: This program will create a Student Class that can hold information about students.*/

import java.util.ArrayList;
import java.lang.Character;
import java.util.Locale;

public class Student {
    private final String studentName;
    private String studentAddress;
    private int studentNumber;
    private String loginID;
    public double totalCredits;
    public double totalPoints;
    private static int i = 1;

    public Student (String name, String address) {
        studentName = name;
        studentAddress = address;
        studentNumber = 10000 + i;
        totalCredits = 0;
        totalPoints = 0;
        i++;
    }

    public Student (String name) {
        studentName = name;
    }

    /**
     * @return the student's name
     */
    public String getName() {
        return studentName;
    }

    /**
     * @return the student's address
     */
    public String getAddress() {
        return studentAddress;
    }

    /**
     * @return the student's student number
     */
    public int getStudentNum() {
        return studentNumber;
    }

    /**
     * Generates and @return the student's loginID
     */
    public String getLoginID() {
        String firstInitial = Character.toString(studentName.charAt(0)), lastName = "",
                lastDigits = String.valueOf(studentNumber);
        lastDigits = lastDigits.substring(lastDigits.length()-2);
        for (int i = 1; i < studentName.length(); i++) {
            if (Character.isWhitespace(studentName.charAt(i))) {
                lastName = studentName.substring(i+1);
                break;
            }
        }
        loginID = firstInitial.toLowerCase() + lastName.toLowerCase() + lastDigits;
        return loginID;
    }

    /**
     * Calculates and @return the student's tuition fees
     */
    public double getTuitionFees() {
        return totalCredits * 101.41;
    }
    /**
     * Adds credits and points to student's file
     */
    public void addCourse(double credits, double points) {
        totalCredits+=credits;
        totalPoints+=points;
    }

    /**
     * Calculates and @return the student's GPA
     */
    public double calculateGPA() {
        return ((double) totalPoints/totalCredits);
    }

    /**
     * @return whether a duplicate exists
     */
    public boolean equals(String studentName, String studentAddress) {
        boolean result = false;
        if ((this.studentName == studentName) && (this.studentAddress == studentAddress)) {
            result = true;
        }
        return result;
    }
    /**
     * @return the student's information
     */
    public String toString() {
        return "\n" + studentName + "\n" + studentAddress + "\n" + studentNumber
                + "\n" + totalCredits + "\n" + totalPoints;
    }
}