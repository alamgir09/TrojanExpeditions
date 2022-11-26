package websocket;

public class ForumMessage {
	// required attributes
	private long messageID; 
	private String message_content; 
	private User sender; 
	
	// optional attributes
	private Location location; 
	
	// static attributes
	private static long totalForumMesNum = 0; 
	
	public ForumMessage(String content, User s) {
		this.messageID = setMessageID(); 
		this.message_content = content; 
		this.setSender(s); 
		this.setLocation(null); 
	}
	
	// a helper function that set MessageID from total message num
	private static long setMessageID() {
		totalForumMesNum ++; 
		return (long)totalForumMesNum;
	}
	
	public long getMessageID() {
		return messageID;
	}
	
	public void printMessage() {
		System.out.println(message_content); 
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
