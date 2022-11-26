// package final_project;

// import java.io.IOException;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.util.ArrayList;
// import java.util.List;

// public class Server {
//     private static Forum forum;
//     private static RatingSystem ratingSystem;
//     private static List<User> userList;
//     private static List<ServerThread> serverThreadList;

//     public Server(int port) {
//         // to do --> implement the main method
//         try {
//             forum = new Forum(); 
//             ratingSystem = new RatingSystem();
//             userList = new ArrayList<User>();
//             serverThreadList = new ArrayList<ServerThread>();
//             System.out.println("Listening on port "+port+ ".");

//             ServerSocket ss = new ServerSocket(port);
//             while (true) {
//                 Socket s = ss.accept();
//                 ServerThread st = new ServerThread(s, this);
//                 System.out.println("Connection from " + s.getInetAddress());
//                 serverThreadList.add(st);
//             }
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }

//     public static void main(String[] args) {
//         // to do --> implement the main method
//         Server server = new Server(3456);
//     }
// }


package websocket;
import java.io.IOException;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@ServerEndpoint(value = "/ws")
public class Server {

	private static Vector<Session> sessionVector = new Vector<Session>();
	
	@OnOpen
	public void open(Session session) {
		System.out.println("Connection made!");
		sessionVector.add(session);
	}
	
	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.println(message);
		try {
			for(Session s : sessionVector) {
				// getBasicRemote() is for synchronous communication
				// getAsyncRemote() is for asynchronous communication
				s.getBasicRemote().sendText(message);
			}
		} catch (IOException ioe) {
			System.out.println("ioe: " + ioe.getMessage());
			close(session);
		}
	}
	
	@OnClose
	public void close(Session session) {
		System.out.println("Disconnecting!");
		sessionVector.remove(session);
	}
	
	@OnError
	public void error(Throwable error) {
		System.out.println("Error!");
	}


	public static void main(String[] args) {
	// public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		ServerSocket server = new ServerSocket(80);
		try {
		  	System.out.println("Server has started on 127.0.0.1:80.\r\nWaiting for a connection…");
		  	Socket client = server.accept();
		  	System.out.println("A client connected.");
		  	InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			Scanner s = new Scanner(in, "UTF-8");
			try {
				String data = s.useDelimiter("\\r\\n\\r\\n").next();
				Matcher get = Pattern.compile("^GET").matcher(data);
				if (get.find()) {
					Matcher match = Pattern.compile("Sec-WebSocket-Key: (.*)").matcher(data);
					match.find();
					byte[] response = ("HTTP/1.1 101 Switching Protocols\r\n"
					  	+ "Connection: Upgrade\r\n"
					  	+ "Upgrade: websocket\r\n"
					  	+ "Sec-WebSocket-Accept: "
					  	+ Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-1").digest((match.group(1) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes("UTF-8")))
					  	+ "\r\n\r\n").getBytes("UTF-8");
					out.write(response, 0, response.length);
					byte[] decoded = new byte[6];
					byte[] encoded = new byte[] { (byte) 198, (byte) 131, (byte) 130, (byte) 182, (byte) 194, (byte) 135 };
					byte[] key = new byte[] { (byte) 167, (byte) 225, (byte) 225, (byte) 210 };
					for (int i = 0; i < encoded.length; i++) {
					  decoded[i] = (byte) (encoded[i] ^ key[i & 0x3]);
					}
				}
			} finally {
				s.close();
			}
		} finally {
			server.close();
		}
	}
}
