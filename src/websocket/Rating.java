package websocket;

public class Rating {
	// required attributes
	private long ratingID; 
	private int rating_value; 
	private User sender; 
	private Location location; 
	
	// optional attributes
	private String rating_content; 
	private int quiteness; 
	private int cleaness; 
	
	// static attributes
	private static long totalRatingNum = 0; 
	
	public Rating(int val, User s, Location loc) {
		this.ratingID = setRatingID(); 
		this.setRating_value(val); 
		this.setSender(s); 
		this.setLocation(loc); 
	}
	
	// a helper function that generate a rating ID
	private static long setRatingID() {
		totalRatingNum++; 
		return (long) totalRatingNum; 
	}
	
	public long getRatingID() {
		return ratingID; 
	}

	public int getRating_value() {
		return rating_value;
	}

	public void setRating_value(int rating_value) {
		this.rating_value = rating_value;
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

	public String getRating_content() {
		return rating_content;
	}

	public void setRating_content(String rating_content) {
		this.rating_content = rating_content;
	}

	public int getQuiteness() {
		return quiteness;
	}

	public void setQuiteness(int quiteness) {
		this.quiteness = quiteness;
	}

	public int getCleaness() {
		return cleaness;
	}

	public void setCleaness(int cleaness) {
		this.cleaness = cleaness;
	}
}
