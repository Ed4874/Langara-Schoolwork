/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 15, 2021
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
    private double totalCredits;
    private double totalPoints;
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

    public String getName() {
        return studentName;
    }

    public String getAddress() {
        return studentAddress;
    }

    public int getStudentNum() {
        return studentNumber;
    }

    public String getLoginID() {
        String firstInitial = Character.toString(studentName.charAt(0)), lastName = "",
                lastDigits = String.valueOf(studentNumber);
        lastDigits = lastDigits.substring(lastDigits.length()-2);
        for (int i = 1; i < studentName.length(); i++) { ;
            if (Character.isWhitespace(studentName.charAt(i))) {
                lastName = studentName.substring(i+1);
                break;
            }
        }
        loginID = firstInitial.toLowerCase() + lastName.toLowerCase() + lastDigits;
        return loginID;
    }
    public void addCourse(double credits, double points) {
        totalCredits+=credits;
        totalPoints+=points;
    }

    public double calculateGPA() {
        return ((double) totalPoints/totalCredits);
    }
}