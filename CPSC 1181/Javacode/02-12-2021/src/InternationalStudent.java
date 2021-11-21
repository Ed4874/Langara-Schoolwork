/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Due: February 23, 2021
 *JDK Version: 14
 *Purpose: This program will create a child class of the Student Class that can hold information about international students.*/

public class InternationalStudent extends Student {
    private String studentName;
    private String studentAddress;
    private String originCountry;

    public InternationalStudent(String studentName, String studentAddress, String originCountry) {
        super(studentName, studentAddress);
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.originCountry = originCountry;
    }

    /**
     * @return the student's origin country
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Overrides the equals method in the Student class
     * @return whether a duplicate exists
     */
    public boolean equals(String studentName, String studentAddress, String country) {
        boolean result = false;
        if ((this.studentName == studentName) && (this.studentAddress == studentAddress) && (originCountry == country)) {
            result = true;
        }
        return result;
    }

    /**
     * Overrides the getTuitionFees method in the Student Class
     * Calculates and @return the international student's tuition fees
     */
    @Override
    public double getTuitionFees() {
        return totalCredits * 625.40;
    }

    /**
     * @return the student's information
     */
    @Override
    public String toString() {
        return "\n" + studentName + "\n" + getAddress() + "\n" + originCountry;
    }


}
