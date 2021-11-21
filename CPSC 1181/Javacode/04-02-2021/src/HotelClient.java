/**Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Class: CPSC 1181-W03
 * Due Date: April 10, 2021
 * Purpose: This program will serve as a client for a Hotel class
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HotelClient {
    public static void main(String args[]) throws IOException {
        //Creating a new socket so the server and the client can be connected
        Socket socket = new Socket("localhost", 4000);

        //Creating a PrintWriter so the program can print to the server
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to do?");
        String userInput = in.nextLine();
        printWriter.println(userInput);
        printWriter.flush();

        //InputStreamReader and BufferedReader are used to receive and display messages from the server
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String input = bufferedReader.readLine();
        System.out.println("System: " + input);

    }

}
