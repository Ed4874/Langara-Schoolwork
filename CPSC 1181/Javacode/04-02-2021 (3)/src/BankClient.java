import java.io.*;
import java.net.*;
import java.util.*;

public class BankClient {
    public static void main(String[] args) throws IOException
    {
        final int SBAP_PORT = 8888;
        Socket s = new Socket("localhost", SBAP_PORT);

        InputStream instream = s.getInputStream();
        OutputStream outstream = s.getOutputStream();

        Scanner in = new Scanner(instream);
        PrintWriter out = new PrintWriter(outstream);

        String command = "DEPOSIT 3 1000\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();
        String response = in.nextLine();
        System.out.println("Receiving: " + response);

        command = "WITHDRAW 3 500\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();
        response = in.nextLine();
        System.out.println("Receiving: " + response);

        command = "QUIT\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();

        s.close();
    }
}
