package final_project;

import java.util.ArrayList;
import java.util.List;

public class Forum {
	private List<ForumMessage> messages; 
	
	public Forum() {
		messages = new ArrayList<ForumMessage>(); 
	}

	public List<ForumMessage> getMessages() {
		return messages;
	}

	public void addMessages(ForumMessage m) {
		this.messages.add(m);
	}
	
}
