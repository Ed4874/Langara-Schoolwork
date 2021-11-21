import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class BusService {
    public BusService(Socket s, Bus bus) throws IOException {
        Socket socket = new Socket("localhost", 11000);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        Scanner user = new Scanner(System.in);

        Bus bus1 = new Bus(10);

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String input = bufferedReader.readLine();

        switch (input) {
            case "AVAILABLE":
                out.writeUTF("SEATS" + bus1.getAvailableSeats());
            case "RESERVE":
            case "QUIT":
                socket.close();
        }
    }
}