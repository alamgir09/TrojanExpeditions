package final_project;

public class ForumMessage {
	// required attributes
	private int messageID; 
	private String message_content; 
	private int senderID; 
	
	// optional attributes
	private int locationID; 
	
	public ForumMessage(int messageID, int senderID, String content) {
		this.messageID = messageID; 
		this.message_content = content; 
		this.setSenderID(senderID);
	}

	public ForumMessage(int messageID, int senderID, String content, int locationID) {
		this.messageID = messageID; 
		this.message_content = content; 
		this.setSenderID(senderID);
		this.setLocationID(locationID);
	}
	
	@Override
	public String toString() {
		return "Message ID: " + messageID + " Message Content: " + message_content + " Sender ID: " + senderID;
	}
	
	public long getMessageID() {
		return messageID;
	}
	
	public void printMessage() {
		System.out.println(message_content); 
	}

	public int getSenderID() {
		return senderID;
	}

	public void setSenderID(int senderID) {
		this.senderID = senderID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
}
