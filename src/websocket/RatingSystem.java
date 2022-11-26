package final_project;

import java.util.ArrayList;
import java.util.List;

public class RatingSystem {
	private List<Location> locations; 
	
	public RatingSystem() {
		locations = new ArrayList<Location>(); 
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void addLocations(Location loc) {
		this.locations.add(loc); 
	}
}
