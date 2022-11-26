package websocket;

import java.io.BufferedOutputStream;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread {
	
	private Socket s;
	private Server server;
	private PrintStream out;
	private BufferedReader in;
	
	private boolean authorized;
	
	
	public ServerThread(Socket s, Server server) {
		try {
			// to do --> store them somewhere, you will need them later 
			in =  new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintStream(new BufferedOutputStream(s.getOutputStream()));

			this.s = s;
			this.server = server;
			
			authorized = false; // default as the user is not signed in
			
			this.start(); 
		} catch (IOException ioe) {
			System.out.println("ioe in ServerThread constructor: " + ioe.getMessage());
		}
	}

	
	public void sendMessage(String message) {
		out.println(message);
		out.flush();
	}
	
	
	

	public void run() {
		// to do --> implement the run method

		while (true){
			// listen to the client from
			// sign up
			// sign in (authorized = true
			// view forum message
			// add forum message (need to be authorized 
			// view rating system message
			// add rating system message (need to be authorized



		}
		
	}
	
}
