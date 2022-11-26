package websocket;

public class User {
	private long userID; 
	private String username; 
	private String password; 
	private String department; 
	private String major; 
	private int graduate_year; 
	private static long totalUserNum; 
	
	public User(String username, String password) {
		this.userID = setUserID(); 
		this.setUsername(username); 
		this.setPassword(password); 
		this.setDepartment(null); 
		this.setMajor(null); 
		this.setGraduate_year(2022); 
	}
	
	private static long setUserID() {
		totalUserNum ++; 
		return (long) totalUserNum; 
	}
	
	public long getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGraduate_year() {
		return graduate_year;
	}

	public void setGraduate_year(int graduate_year) {
		this.graduate_year = graduate_year;
	}
	
	
}
