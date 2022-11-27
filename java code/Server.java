package final_project;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static Forum forum;
    private static RatingSystem ratingSystem;
    private static List<User> userList;
    private static List<ServerThread> serverThreadList;

    public Server(int port) {
        // to do --> implement the main method
        try {
            forum = new Forum(); 
            ratingSystem = new RatingSystem();
            userList = new ArrayList<User>();
            serverThreadList = new ArrayList<ServerThread>();
            System.out.println("Listening on port "+port+ ".");

            ServerSocket ss = new ServerSocket(port);
            while (true) {
                Socket s = ss.accept();
                ServerThread st = new ServerThread(s, this);
                System.out.println("Connection from " + s.getInetAddress());
                serverThreadList.add(st);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // to do --> implement the main method
        Server server = new Server(3456);
    }
}
