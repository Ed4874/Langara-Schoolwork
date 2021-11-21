import java.io.*;
import java.net.*;
import java.util.Date;

/**
 * The purpose of the server is to compute the area when a radius is sent by a client.
 * The Labo9Server should serve many clients.
 * The client communicates to the server that it's done sending radius and the server
 * acknwledges that the client is done with the computations.
 */
public class Lab9Server implements AreaConstants, Runnable {

    String name;
    int num = 0;
    Thread t;
    Lab9Server(String thread){
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    // let's put the main program of the application here
    public static void main(String[] args)
    {
        new Lab9Server();
    }

    /**
     * Reports the server's IP address.
     * It has nothing to do with the clients.... just for fun
     */
    private void reportStatsOnServer() throws UnknownHostException
    {
        System.out.println("This server's computer name is " +
                InetAddress.getLocalHost().getHostName());
        System.out.println("This server's IP address is "+
                InetAddress.getLocalHost().getHostAddress());

        System.out.println("Lab9Server started at " + new Date() + "\n");
    } // reportStatsOnServer

    /**
     * Reports the clients's domain name and IP address.
     * @param socket open socket
     * @param n the client's number (starting with 1)
     */
    private void reportStatsOnClient(Socket socket, int n)
    {
        InetAddress  addr = socket.getInetAddress();
        System.out.println("client " + n + "'s host name is " + addr.getHostName());
        System.out.println("client " + n + "'s IP Address is " + addr.getHostAddress());
        System.out.println("starting thread for client " + n + " at " + new Date());
    } // reportStatsOnClient

    /**
     * Starts the ServerSocket.
     * Keeps on repeating:
     *  - Waits for a Client to connect and open the socket.
     *  - Initialize ComputationService with that opened socket.
     *  - Start the thread.
     * Cleanup as needed.
     */
    public Lab9Server()
    {
        //buildMsgsArea();
        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            reportStatsOnServer();  // for fun

            int n = 0; // number each client
            while (true) // a server goes on and on and on and on
            {
                n++;
                // listen for a new connection request
                // if we had several clients on the same thread,
                // as in a game of 2 players, the connections would all go here
                Socket socket = serverSocket.accept();
                reportStatsOnClient(socket, n);

                Lab9Service service = new Lab9Service(socket);

            } // while true
        } // try
        catch(IOException e)
        {
            System.out.println("problems in server " + e.toString() + "\n");
            e.printStackTrace(System.err);
        }
    } //Lab9Server constructor

    @Override
    public void run() {
        num++;
        new Lab9Server("thread" + Integer.toString(num));
    }
}
//class MultipleThread {
//    public static void main(String args[]) {
//        new Lab9Server("One");
//        new Lab9Server("Two");
//        new Lab9Server("Three");
//        //try {
//        //    Thread.sleep(10000);
//        //} catch (InterruptedException e) {
//        //    System.out.println("Main thread Interrupted");
//        //}
//        //System.out.println("Main thread exiting.");
//    }
//}
//