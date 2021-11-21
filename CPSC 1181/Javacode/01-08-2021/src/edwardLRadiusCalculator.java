/**Student Name: Edward Lu
 * Student Number: 100359822
 * Date Written: January 08, 2021
 * JDK Version: 14 (IntelliJ)
 * Purpose: This program will calculate the area and circumference of a circle using a user-inputted radius.
 **/

import javax.swing.*;

public class edwardLRadiusCalculator {
    public static void main (String[] args) {
        String input = JOptionPane.showInputDialog(null, "Please enter a new radius:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        else {
            double radius = (double) (Double.parseDouble(input));
            if (radius < 0) {
                error(radius);
            }
            else {
                calculations(radius);
            }
        }
    }
    public static void calculations (double radius) {
        double roundedRadius = (Math.round(radius * 100.0) / 100.0);
        JOptionPane.showMessageDialog(null, "Inputted Radius: " + roundedRadius
                + "\nArea of the circle: " + (Math.round(Math.pow(roundedRadius, 2) * Math.PI * 100.0) / 100.0)
                + "\nCircumference of the circle: " + (Math.round(2 * Math.PI * roundedRadius * 100.0) / 100.0),
                "Results", JOptionPane.PLAIN_MESSAGE);
        restart();
    }
    public static void error (double radius) {
        JOptionPane.showMessageDialog(null, radius + " is not a positive number.", "Error",
                JOptionPane.PLAIN_MESSAGE);
        restart();
    }
    public static void restart () {
        String[] options = {"Yes", "No"};
        int y = JOptionPane.showOptionDialog(null, "Would you like to play again?",
                "Replay?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        if (y == 0) {
            main(null);
        }
        else {
            System.exit(0);
        }
    }
}
