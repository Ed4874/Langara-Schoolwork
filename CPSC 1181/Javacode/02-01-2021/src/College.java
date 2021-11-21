/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: February 1, 2021
 *JDK Version: 14
 *Purpose: This program will serve as the database for multiple Student objects.*/

import java.util.ArrayList;

public class College {
    private ArrayList<Student> studentList;

    //This will create a new ArrayList using the Student Class
    public College() {
        studentList = new ArrayList<Student>();
    }

    //This method will add students to the studentList arraylist
    public void addStudent(Student addStudent) {
        studentList.add(addStudent);
        System.out.println();
    }

    //This method will remove students from the studentList arraylist
    public void removeStudent(int studentNumber) {
        for (int i = 0; i < studentList.size(); i++) {
            Student studentInfo = studentList.get(i);
            if (studentInfo.getStudentNum() == studentNumber) {
                studentList.remove(studentInfo);
            }
        }
    }

    //This method will take a student number and return the corresponding student's name
    public String viewStudent(int studentNumber) {
        String studentName = "";
        for (Student studentInfo : studentList) {
            if (studentInfo.getStudentNum() == studentNumber) {
                studentName = studentInfo.getName();
            }
        }
        return studentName;
    }

    //This method will take a student number, credits and grade point value and add them to the student specified
    public void addStudentCredit(int studentNumber, double credits, double gpv) {
        for (Student studentInfo : studentList) {
            if (studentInfo.getStudentNum() == studentNumber) {
                studentInfo.addCourse(credits, gpv);
            }
        }
    }

    //This method will return the login ID of the student using their name and student number
    public String getLoginID(int studentNumber) {
        String loginID = "";
        for (Student studentInfo : studentList) {
            if (studentInfo.getStudentNum() == studentNumber) {
                loginID = studentInfo.getLoginID();
            }
        }
        return loginID;
    }

    //This method will get the highest GPA in the arraylist and return it alongside the student's name
    public String getHighestGPA() {
        double GPA = 0.0, highestGPA = 0.0;
        String studentName = "";
        for (Student studentInfo : studentList) {
            GPA = studentInfo.calculateGPA();
            if (GPA >= highestGPA) {
                highestGPA = GPA;
                studentName = studentInfo.getName();
            }
        }
        return studentName + ": " + Double.toString(highestGPA);
    }
}
