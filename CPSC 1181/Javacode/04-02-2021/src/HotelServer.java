/**Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Class: CPSC 1181-W03
 * Due Date: April 10, 2021
 * Purpose: This program will serve as a multithreaded server for a Hotel class
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HotelServer {
    public static void main(String args[]) throws IOException {
        //Creating a new socket so the server and the client can be connected
        ServerSocket serverSocket = new ServerSocket(4000);
        Socket socket = serverSocket.accept();

        //Printing a welcome message
        System.out.println("Connection Established. \nWelcome.");

        //InputStreamReader and BufferedReader are used to receive and display messages from the client
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //This will split the user-inputted string and use the first keyword to decide its command
        String input = bufferedReader.readLine();
        String[] arr = input.split(" ", 2);
        System.out.println("User: " + arr[1]);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

        Hotel hotel = new Hotel();

        switch (arr[0]) {
            case "USER":
                printWriter.println("Hello, " + arr[1]);
                printWriter.flush();
                break;
            case "RESERVE":
                //hotel.requestReservation();
                break;
            case "CANCEL":
                break;
            case "AVAIL":
                break;
            case "QUIT":
                break;
            default:
                System.out.println("Invalid Command: Closing Connection");
                break;
        }

    }

}