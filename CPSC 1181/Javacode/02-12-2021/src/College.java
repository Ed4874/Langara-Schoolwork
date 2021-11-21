/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Due: February 23, 2021
 *JDK Version: 14
 *Purpose: This program will serve as the database for multiple types of Student objects.*/

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

    public void addGraduateStudent(GraduateStudent addStudent) {
        studentList.add(addStudent);
        System.out.println();
    }

    public void addInternationalStudent(InternationalStudent addStudent) {
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
    /**
     * Finds the student with the matching student number and @return said student's tuition fees
     */
    public double getTuitionFees(int studentNumber) {
        double result = 0;
        for (Student studentInfo : studentList) {
            if (studentInfo.getStudentNum() == studentNumber) {
                result = studentInfo.getTuitionFees();
            }
        }
        return result;
    }

    /**
     * @return whether the user-inputted student matches a student in the database or not
     */
    public boolean findMatch(Student query) {
        boolean result = false;
        for (Student student : studentList) {
            if ((query.getName().equals(student.getName())) && (query.getAddress() == student.getAddress())) {
                result = true;
                break;
            }
        }
        return result;
    }
    public boolean findMatch(GraduateStudent query) {
        boolean result = false;
        for (Student student : studentList) {
            if ((query.getName().equals(student.getName())) &&
                    (query.getAddress().equals(student.getAddress())) &&
                    (student instanceof GraduateStudent)) {
                if ((query.getSupervisorName().equals(((GraduateStudent) student).getSupervisorName())) &&
                        (query.getResearchTopic().equals(((GraduateStudent) student).getResearchTopic())) &&
                        (query.getAdvisorName().equals(((GraduateStudent) student).getAdvisorName()))) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    public boolean findMatch(InternationalStudent query) {
        boolean result = false;
        for (Student student : studentList) {
            if ((!query.getName().equals(student.getName())) ||
                    (!query.getAddress().equals(student.getAddress())) ||
                    (!(student instanceof InternationalStudent))) {
                continue;
            }
            if (query.getOriginCountry().equals(((InternationalStudent) student).getOriginCountry())) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @return whether there were duplicate students in the database or not
     * **Wasn't able to complete this because of the complexity**
     */
    public boolean findMatch() {
        boolean result = false;
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.size(); j++) {
                if (j == i) {
                    j++;
                }
                if (studentList.get(i).equals(studentList.get(j).getName(), studentList.get(j).getAddress())) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }


    /**
     * @return the entire studentList
     */
    public String toString() {
        return studentList.toString();
    }
}
