/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 17, 2021
 *JDK Version: 14
 *Purpose: This program will test the Student Class created for Assignment2.*/

import java.util.Scanner;

public class StudentTest {
    public static void main (String[] args) {

        Student student1 = new Student("Edward Lu", "1234 Random Street, Vancouver, BC");
        Student student2 = new Student("Robert McDonald", "9876 RNG Road, Richmond, BC");
        GraduateStudent student3 = new GraduateStudent("Nancy Perosi",
                "3 1415 Arbitrary Anchorage, Abbotsford, BC", "Computer Science",
                "Professor Hamavand", "Tom Felton");
        InternationalStudent student4 = new InternationalStudent("SiHan Lu",
                "3456 Random Route", "China");

        System.out.println("The student's name is " + student1.getName());
        System.out.println("The student's address is " + student1.getAddress());
        System.out.println("The student's student number is " + student1.getStudentNum());
        System.out.println("The student's login ID is " + student1.getLoginID());
        student1.addCourse(3.00, 9.00);
        student1.addCourse(3.00, 12.00);
        System.out.println("The student's GPA is " + student1.calculateGPA());

        System.out.println("\n");

        System.out.println("The student's name is " + student2.getName());
        System.out.println("The student's address is " + student2.getAddress());
        System.out.println("The student's student number is " + student2.getStudentNum());
        System.out.println("The student's login ID is " + student2.getLoginID());
        student2.addCourse(3.00, 11.10);
        student2.addCourse(3.00, 9.00);
        System.out.println("The student's GPA is " + student2.calculateGPA());

        System.out.println("\n");

        System.out.println("The student's name is " + student3.getName());
        System.out.println("The student's address is " + student3.getAddress());
        System.out.println("The student's student number is " + student3.getStudentNum());
        System.out.println("The student's login ID is " + student3.getLoginID());
        student3.addCourse(3.00, 11.10);
        student3.addCourse(4.00, 12.00);
        System.out.println("The student's GPA is " + student3.calculateGPA());
        System.out.println("The student's area of research is " + student3.getResearchTopic());
        System.out.println("The student's supervisor is " + student3.getSupervisorName());
        System.out.println("The student's advisor is " + student3.getAdvisorName());

        System.out.println("\n");

        System.out.println("The student's name is " + student4.getName());
        System.out.println("The student's address is " + student4.getAddress());
        System.out.println("The student's student number is " + student4.getStudentNum());
        System.out.println("The student's login ID is " + student4.getLoginID());
        student4.addCourse(3.00, 11.00);
        student4.addCourse(4.00, 12.00);
        System.out.println("The student's GPA is " + student4.calculateGPA());
        System.out.println("The student's country of origin is " + student4.getOriginCountry());
    }
}
