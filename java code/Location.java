package final_project;

import java.util.ArrayList;
import java.util.List;

public class Location {
	// required attributes
	private int locID; 
	private List<Rating> ratings; 
	private String loc_name; 
	
	// optional attributes
	// Null
	
	public Location(String name, int locID) {
		this.setLoc_name(name); 
		this.locID = locID;
		ratings = new ArrayList<Rating>(); 
	}
	
	public int getLocID() {
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
