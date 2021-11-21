/**Student Name: Edward Lu
 * Student Number: 100359822
 * Date Written: January 05, 2021
 * JDK Version: 14 (IntelliJ)
 * Purpose: This program will play the "Mystery Number" Game.
 **/

//Importing swing so JDialog and other JOptionPane tools would work
import javax.swing.*;

public class edwardLMysteryNumber {
    public static void main (String[] args) {
        //Showing difficulty settings as buttons for the user to choose from
        String[] options = {"Beginner", "Intermediate", "Expert"};
        int x = JOptionPane.showOptionDialog(null, "Which difficulty would you like to play on?",
                "Mystery Number",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[2]);
        /*This if statement will detect whether the user pressed the cancel button
        if they do, the program will exit without any errors. Otherwise, it will call
        the first step.
         */
        if (x < 0) {
            System.exit(0);
        }
        else {
            stepOne(x);
        }
    }
    //Every step will display a step of the game, and go the next step when the player presses ok.
    public static void stepOne (int x){
        JOptionPane.showMessageDialog(null, "Please think of an integer.", "Step One",
                JOptionPane.PLAIN_MESSAGE);
        stepTwo(x);
    }
    public static void stepTwo (int x) {
        JOptionPane.showMessageDialog(null, "Add 25 to your number.", "Step Two",
                JOptionPane.PLAIN_MESSAGE);
        stepThree(x);
    }
    /*If the user chose the beginner option, the program will detect this
    and skip over the rest of the steps to go to the input dialog.*/
    public static void stepThree (int x) {
        JOptionPane.showMessageDialog(null, "Divide your number by 4.", "Step Three",
                JOptionPane.PLAIN_MESSAGE);
        switch (x) {
            case 0:
                beginnerResult(x);
            case 1,2:
                stepFour(x);
        }
    }
    public static void stepFour (int x) {
        JOptionPane.showMessageDialog(null, "Subtract 2 from your number.", "Step Four",
                JOptionPane.PLAIN_MESSAGE);
        stepFive(x);
    }
    /*If the user chose the immediate option, the program will detect this
    and skip over the rest of the steps to go to the input dialog.*/
    public static void stepFive (int x) {
        JOptionPane.showMessageDialog(null, "Multiply your number by 3.", "Step Five",
                JOptionPane.PLAIN_MESSAGE);
        switch (x) {
            case 1:
                intermediateResult(x);
            case 2:
                stepSix(x);
        }
    }
    public static void stepSix (int x) {
        JOptionPane.showMessageDialog(null, "Add 33 to your your number.", "Step Six",
                JOptionPane.PLAIN_MESSAGE);
        stepSeven(x);
    }
    public static void stepSeven (int x) {
        JOptionPane.showMessageDialog(null, "Subtract 17 from your number.", "Step Seven",
                JOptionPane.PLAIN_MESSAGE);
        expertResult(x);
    }
    /*This part of the program will ask the user for their input, and using their result calculate their original number*/
    public static void beginnerResult(int x) {
        String input = JOptionPane.showInputDialog(null, "Input Prompt:", "Beginner Mode", JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        int number = (int)((Double.parseDouble(input) * 4) - 25);
        numberGuess(number, x);
    }
    public static void intermediateResult(int x) {
        String input = JOptionPane.showInputDialog(null, "Input Prompt:", "Intermediate Mode", JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        int number = (int)((((Double.parseDouble(input) / 3) + 2) * 4) - 25);
        numberGuess(number, x);
    }
    public static void expertResult(int x) {
        String input = JOptionPane.showInputDialog(null, "Input Prompt:", "Expert Mode", JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        int number = (int)((((((Double.parseDouble(input) + 17) - 33) / 3) + 2) * 4) - 25);
        numberGuess(number, x);
    }
    //This dialog box will show the program's final response
    public static void numberGuess (int finalNumber, int x) {
        JOptionPane.showMessageDialog(null, "I'm guessing your number is " + finalNumber + ".", "Result",
                JOptionPane.PLAIN_MESSAGE);
        restart(x);
    }
    /*This dialog box will ask the user if they want to replay or not.
    If they do, the game will restart with the same setting they chose in the beginning on the game.*/
    public static void restart (int x) {
        String[] options = {"Yes", "No"};
        int y = JOptionPane.showOptionDialog(null, "Would you like to play again?",
                "Replay?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        if (y == 0) {
            stepOne(x);
        }
        else {
            System.exit(0);
        }
    }
}
