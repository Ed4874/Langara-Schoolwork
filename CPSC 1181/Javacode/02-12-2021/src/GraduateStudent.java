/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Due: February 23, 2021
 *JDK Version: 14
 *Purpose: This program will create a child class of the Student Class that can hold information about graduate students.*/

public class GraduateStudent extends Student {

    private String name;
    private String address;
    private String supervisorName;
    private String advisorName;
    private String researchTopic;

    public GraduateStudent(String name, String address, String research, String supervisor, String advisor) {
        super(name, address);
        this.name = name;
        this.address = address;
        researchTopic = research;
        supervisorName = supervisor;
        advisorName = advisor;
        totalCredits = 0;
        totalPoints = 0;
    }
    /**
     * @return the student's area of research
     */
    public String getResearchTopic() {
        return researchTopic;
    }

    /**
     * @return the student's supervisor
     */
    public String getSupervisorName() {
        return supervisorName;
    }

    /**
     * @return the student's advisor
     * **Wasn't sure whether we were actually supposed to create an advisor, since it was only mentioned once in the assignment outline.**
     */
    public String getAdvisorName() {
        return advisorName;
    }

    /**
     * Overrides the equals method in the Student class
     * @return whether a duplicate exists
     */
    public boolean equals(String studentName, String studentAddress, String research, String supervisor, String advisor) {
        boolean result = false;
        if ((this.name == studentName) && (this.address == studentAddress) && (researchTopic == research) &&
                (supervisorName == supervisor) && (advisorName == advisor)) {
            result = true;
        }
        return result;
    }

    /**
     * Overrides the toString method in the Student Class
     * @return the student's information
     */
    @Override
    public String toString() {
        return "\n" + name + "\n" + address + "\n" + researchTopic +
                "\n" + supervisorName + "\n" + advisorName;
    }


}
