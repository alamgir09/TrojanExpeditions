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


package final_project;

import java.io.IOException;
import java.util.Vector;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

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
}
