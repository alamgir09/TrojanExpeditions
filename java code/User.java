package final_project;

public class User {
	private int userID; 
	private String username; 
	private String password; 
	private String email;
	private String department; 
	private String major; 
	private int graduate_year; 
	
	public User(int id, String username, String password, String email) {
		this.userID = setUserID(id); 
		this.setUsername(username); 
		this.setPassword(password); 
		this.setEmail(email);
		this.setDepartment(null); 
		this.setMajor(null); 
		this.setGraduate_year(2022); 
	}

	public User(int id, String username, String password, String email,String department, String major, int year) {
		this.userID = setUserID(id); 
		this.setUsername(username); 
		this.setPassword(password); 
		this.setEmail(email);
		this.setDepartment(department); 
		this.setMajor(major); 
		this.setGraduate_year(year); 
	}
	
	private static int setUserID(int id) {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
