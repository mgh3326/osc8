
/**
 * Time-of-day server listening to port 6013.
 *
 * Figure 3.19
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts  - Eighth Edition
 * Copyright John Wiley & Sons - 2008.
 */
 
import java.net.*;
import java.io.*;

public class DateServer
{
	public static void main(String[] args)  {
		try {
			ServerSocket sock = new ServerSocket(6013);

			// now listen for connections
			while (true) {
				Socket client = sock.accept();
				// we have a connection
				
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
				// write the Date to the socket
				// pout.println(new java.util.Date().toString());
				pout.println("test\n");
				// close the socket and resume listening for more connections
				client.close();
			}
		}
		catch (IOException ioe) {
				System.err.println(ioe);
		}
	}
}
