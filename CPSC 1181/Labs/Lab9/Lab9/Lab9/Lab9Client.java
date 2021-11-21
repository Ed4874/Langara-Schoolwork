import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * The purpose of the client is to send a radius to the server to have the
 * area of a circle computed. The radius is obtained from the user.
 * The client communicates to the server that it's done sending radius and the server
 * acknwledges that the client is done with the computations.
 */

public class Lab9Client implements AreaConstants {

    // the instance variables socket, toServer, and fromServer
    private Socket socket;
    private DataOutputStream toServer;
    private DataInputStream fromServer;

    /**
     * The localhost is used.
     * No serious error checking is done.
     * precondition: the one argument that there might be,
     * is either the server's domain name or the server's IP Address
     * @param args the line commands
     */
    public static void main(String[] args) {
        String serverHost = "localhost"; // could have used "127.0.0.1"
        new Lab9Client(serverHost);
    }
    /**
     * Sets up the User Interface so that the radius can
     * be obtained and it sets ups the I/O streams from a socket.
     * @param serverHost IPAddress of server that is running
     */
    public Lab9Client(String serverHost) {
        openConnection(serverHost);
        buildUI();
    } // Lab9Client

    /**
     * Creates a socket with the PORT and opens its input
     * and output streams called fromServer and toServer.
     */
    private void openConnection(String serverHost) {
        try {
            this.socket = new Socket(serverHost, PORT);
            this.fromServer = new DataInputStream(socket.getInputStream());
            this.toServer = new DataOutputStream(socket.getOutputStream());
        }
        catch (SecurityException e) {
            System.err.println("a security manager exists");
            System.err.println("its checkConnect doesn't allow the connection.... bye");
        }
        catch (UnknownHostException e) {
            System.out.println("the IP address of the host could not be found...cannot go on, bye");
        }
        catch (IOException e) {
            System.err.println("cannot seem to be able to connect to the server");
            System.err.println("the server IP address I was hoping to connect to is");
            System.err.println(" \"" + serverHost + "\"");
            System.err.println("without a SERVER, I'm toast ... no point going on so bye, bye");
        }
    } // openConnection


    /**
     * Processes the messages coming from the server
     *
     *   from server -> client
     *   AREA d
     *     d is the area computed in the server
     *   reports (shows) this result on the GUI
     *
     *   from server -> client
     *   DONE
     *     nothing else is going to be sent to the client anymore
     *     the server is done serving
     *   As a result of the DONE, we remove the action listener of
     *   the rField and we set the rField to non-editable
     */
    public void startRequest() {
        System.out.println("startRequest method");
        boolean done = false;
        try {
            while (!done) {
                System.out.println("Waiting for area");
                int msg = fromServer.readInt();
                if (msg == AREA) {
                    double area = fromServer.readDouble();
                    System.out.println(String.format("area = %.2f \n", area));
                   // System.out.println("Received area: " + area);
                    done = true;

                }
                else if (msg == DONE) {
                    done = true;

                    System.out.println("... finito ... ");
                }
                else {
                    throw new IOException("unknown message=" + String.valueOf(msg) + " from server");
                }
            } // while
        } // try
        catch (IOException e) {
            System.out.println(e.getCause().getMessage() + "\n");
            e.printStackTrace(System.err);
        } // catch
    } // run

    /**
     * Closes the socket (the input and output data streams are closed automatically).
     * NOTE: do not use socket.isConnected because it is NOT the same as isClosed -- read up on it
     */
    private void closeConnection() {
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
        catch (IOException e) {
            System.err.println("xxxxxx I failed to close properly (socket or data stream) xxxxxx ");
        }
        socket = null;
    }



    private void buildUI() {
        double radius = 1;
        Scanner scan = new Scanner(System.in);

        while (radius > 0) {
            try {
                System.out.println("Please enter the radius: ");
                radius = scan.nextDouble();

                if (radius < 0) {
                    toServer.writeInt(QUIT);
                    System.out.println("telling server that I want to quit");
                } else {
                    System.out.println("sending to server radius = " + radius);
                    toServer.writeInt(RADIUS);
                    toServer.writeDouble(radius);
                }
                toServer.flush();
                System.out.println("calling the startRequest");
                startRequest();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
