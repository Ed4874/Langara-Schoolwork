import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BusClient {
    public static void main( String[] args )  throws IOException {

        Socket client = null;
        int seatNumber;
        String command;
        try {
            client = new Socket( "localhost", 11000 );
            DataOutputStream out = new DataOutputStream(client.getOutputStream( ));
            DataInputStream in = new DataInputStream(client.getInputStream( ));
            Scanner user = new Scanner(System.in);

            do {
                System.out.println("Enter one of the following commands: \n\tAVAILABLE \n\tRESERVE or \n\tQUIT");
                command = user.next().toUpperCase();
                switch(command){
                    case "AVAILABLE":
                        out.writeUTF(command);
                        out.flush();
                        serverResponse(in);
                        break;

                    case "RESERVE":
                        System.out.println("Enter the seat number: ");
                        seatNumber = user.nextInt();
                        out.writeUTF(command);
                        out.writeInt(seatNumber);
                        out.flush();
                        serverResponse(in);
                        break;
		    
                    case "QUIT":
                        System.out.println("Bye");
                        out.writeUTF(command);
                        out.flush();
                        break;
		    
                    default:
                        System.out.println("Not a valid command");
                }
            }while(!command.equals("QUIT"));

        }
        catch( IOException e ) {
            System.out.println("Program terminated unexpectly!");
        }
        finally {
            System.out.println("End of request");
            client.close();
        }
    }
    //----
    // The method shows the response of the server
    public static void serverResponse(DataInputStream in) throws IOException{
        String response = in.readUTF();
      
        switch(response){
            case "SEATS":
                String  availableSeats = in.readUTF();
                System.out.println(">> SEATS "+ availableSeats);
                break;
            case "SUCCEED":
                System.out.println(">> SUCCEED");
                break;
            case "FAILED":
                System.out.println(">> FAILED");
                break;
	    default:
		    System.out.println(response);
        }
    }

}
