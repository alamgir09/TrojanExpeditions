package websocket;

import java.util.ArrayList;
import java.util.List;

public class Location {
	// required attributes
	private long locID; 
	private List<Rating> ratings; 
	private String loc_name; 
	
	// optional attributes
	// Null
	
	// static attributes 
	private static long totalLocNum = 0; 
	
	public Location(String name) {
		this.setLoc_name(name); 
		this.locID = setLocID();
		ratings = new ArrayList<Rating>(); 
	}
	
	// a helper function that set the location ID from total loc num; 
	private static long setLocID() {
		totalLocNum ++;
		return (long) totalLocNum; 
	}
	
	public long getLocID() {
		return locID;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void addRatings(Rating r) {
		this.ratings.add(r);
	}

	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	
}
