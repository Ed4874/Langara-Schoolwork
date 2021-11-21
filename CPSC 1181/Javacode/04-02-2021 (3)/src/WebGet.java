import java.io.*;
import java.net.*;
import java.util.*;

public class WebGet {
    public static void main(String[] args) throws IOException {
        // Get command-line arguments

        String host;
        String resource = "/";

        if (args.length == 2) {
            host = args[0];
        }
        else {
            System.out.println("Getting / from yahoo.ca");
            host ="yahoo.ca";
        }

        // Open socket
        System.out.println("Open socket.....\n\n");
        final int HTTP_PORT = 80;
        Socket s = new Socket(host, HTTP_PORT);

        // Get streams
        InputStream instream = s.getInputStream();
        OutputStream outstream = s.getOutputStream();

        // Turn streams into scanners and writers
        Scanner in = new Scanner(instream);
        PrintWriter out = new PrintWriter(outstream);

        // send command
        System.out.println("Send the HTTP command....\n\n");
        String command = "GET " + resource + " HTTP/1.0\n\n";
        out.print(command);
        out.flush();

        // Read server response
        System.out.println("Read server response...\n");

        while (in.hasNextLine()) {
            String input = in.nextLine();
            System.out.println(input);
        }

        // Always close the socket at the end
        s.close();
    }
}
