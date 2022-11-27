package final_project;

public class Rating {
	// required attributes
	private int ratingID; 
	private int rating_value; 
	private int userID; 
	private int locationID; 
	
	// optional attributes
	private String rating_content; 
	private int quiteness; 
	private int cleaness; 
	
	
	public Rating(int id, int val, int userID, int locationID) {
		this.ratingID = id; 
		this.setRating_value(val); 
		this.setSender(userID); 
		this.setLocationID(locationID); 
	}

	public Rating(int id, int val, int userID, int locationID, String content, int quiet, int clean) {
		this.ratingID = id; 
		this.setRating_value(val); 
		this.setSender(userID); 
		this.setLocationID(locationID); 
		this.setRating_content(content); 
		this.setQuiteness(quiet);
		this.setCleaness(clean);
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

	public int getSender() {
		return userID;
	}

	public void setSender(int userID) {
		this.userID = userID;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
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
