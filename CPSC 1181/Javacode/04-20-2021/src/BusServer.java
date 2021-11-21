import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BusServer {
    public static void main(String[] args) throws IOException {
        Bus bus = new Bus(10);

        final int SBAP_PORT = 11000;
		try (ServerSocket server = new ServerSocket(SBAP_PORT)) {
			while (true) {
				try{
					System.out.println("Waiting for a client");
					Socket s = server.accept();
					System.out.println("Client connected.");
					BusService service = new BusService(s, bus);
					Thread t = new Thread((Runnable) service);
					t.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		   
		} catch (IOException e) {}
	
		}

}
