package final_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC {
	String user = null;
	String password = null;
	Connection conn = null;
	
	JDBC(String user, String password){
		this.user = user;
		this.password = password;
		connect();
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sys?user=" + user +
				 "&password=" + password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createDB(){
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Ratingapp");
			stmt.executeUpdate("USE Ratingapp");
			stmt.executeUpdate("SET FOREIGN_KEY_CHECKS=0");

			//CREATE TABLE `Location` (
			//   `LocationID` int NOT NULL,
			//   `LocationName` varchar(200) NOT NULL,
			//   PRIMARY KEY (`LocationID`),
			//   UNIQUE KEY `LocationID` (`LocationID`),
			//   UNIQUE KEY `LocationName` (`LocationName`)
			// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `Location` ("
					+ "`LocationID` int NOT NULL AUTO_INCREMENT,"
					+ " `LocationName` varchar(200) NOT NULL,"
					+ " PRIMARY KEY (`LocationID`),"
					+ " UNIQUE KEY `LocationID` (`LocationID`),"
					+ " UNIQUE KEY `LocationName` (`LocationName`)"
					+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci");

			// CREATE TABLE `ForumMessage` (
			//   `MessageID` int NOT NULL,
			//   `MessageContent` varchar(1000) NOT NULL,
			//   `SenderID` int NOT NULL,
			//   `LocationID` int DEFAULT NULL,
			//   PRIMARY KEY (`MessageID`),
			//   UNIQUE KEY `MessageID` (`MessageID`),
			//   KEY `SenderID` (`SenderID`),
			//   KEY `LocationID` (`LocationID`),
			//   CONSTRAINT `forummessage_ibfk_1` FOREIGN KEY (`SenderID`) REFERENCES `User` (`UserID`),
			//   CONSTRAINT `forummessage_ibfk_2` FOREIGN KEY (`LocationID`) REFERENCES `Location` (`LocationID`)
			// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `ForumMessage` ("
					+ "`MessageID` int NOT NULL AUTO_INCREMENT,"
					+ " `MessageContent` varchar(1000) NOT NULL,"
					+ " `SenderID` int NOT NULL,"
					+ " `LocationID` int DEFAULT NULL,"
					+ " PRIMARY KEY (`MessageID`),"
					+ " UNIQUE KEY `MessageID` (`MessageID`),"
					+ " KEY `SenderID` (`SenderID`),"
					+ " KEY `LocationID` (`LocationID`),"
					+ " CONSTRAINT `forummessage_ibfk_1` FOREIGN KEY (`SenderID`) REFERENCES `User` (`UserID`),"
					+ " CONSTRAINT `forummessage_ibfk_2` FOREIGN KEY (`LocationID`) REFERENCES `Location` (`LocationID`)"
					+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci");

			// CREATE TABLE `Rating` (
			// `RatingID` int NOT NULL,
			// `RatingValue` decimal(10,0) NOT NULL,
			// `SenderID` int NOT NULL,
			// `LocationID` int NOT NULL,
			// `RatingContent` varchar(1000) NOT NULL,
			// `QuietnessRatingValue` decimal(10,0) DEFAULT NULL,
			// `CleanessRatingValue` decimal(10,0) DEFAULT NULL,
			// PRIMARY KEY (`RatingID`),
			// UNIQUE KEY `RatingID` (`RatingID`),
			// KEY `SenderID` (`SenderID`),
			// KEY `LocationID` (`LocationID`),
			// CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`SenderID`) REFERENCES `User` (`UserID`),
			// CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`LocationID`) REFERENCES `Location` (`LocationID`)
			// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `Rating` ("
					+ "`RatingID` int NOT NULL AUTO_INCREMENT,"
					+ " `RatingValue` decimal(10,0) NOT NULL,"
					+ " `SenderID` int NOT NULL,"
					+ " `LocationID` int NOT NULL,"
					+ " `RatingContent` varchar(1000) NOT NULL,"
					+ " `QuietnessRatingValue` decimal(10,0) DEFAULT NULL,"
					+ " `CleanessRatingValue` decimal(10,0) DEFAULT NULL,"
					+ " PRIMARY KEY (`RatingID`),"
					+ " UNIQUE KEY `RatingID` (`RatingID`),"
					+ " KEY `SenderID` (`SenderID`),"
					+ " KEY `LocationID` (`LocationID`),"
					+ " CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`SenderID`) REFERENCES `User` (`UserID`),"
					+ " CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`LocationID`) REFERENCES `Location` (`LocationID`)"
					+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci");
			
			// CREATE TABLE `user` (
			// `UserID` int NOT NULL,
			// `Username` varchar(50) NOT NULL,
			// `Email` varchar(50) DEFAULT NULL,
			// `PassWord` varchar(50) NOT NULL,
			// `Department` varchar(50) DEFAULT NULL,
			// `Major` varchar(50) DEFAULT NULL,
			// `GradYear` int DEFAULT NULL,
			// PRIMARY KEY (`UserID`),
			// UNIQUE KEY `UserID` (`UserID`),
			// UNIQUE KEY `Username` (`Username`)
			// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS `User` ("
					+ " `UserID` int NOT NULL AUTO_INCREMENT,"
					+ " `Username` varchar(50) NOT NULL,"
					+ " `Email` varchar(50) DEFAULT NULL,"
					+ " `PassWord` varchar(50) NOT NULL,"
					+ " `Department` varchar(50) DEFAULT NULL,"
					+ " `Major` varchar(50) DEFAULT NULL,"
					+ " `GradYear` int DEFAULT NULL,"
					+ " PRIMARY KEY (`UserID`),"
					+ " UNIQUE KEY `UserID` (`UserID`),"
					+ " UNIQUE KEY `Username` (`Username`)"
					+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci");
			
			stmt.executeUpdate("SET FOREIGN_KEY_CHECKS=1");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DISCOURAGED to use since DB should have UserID auto incremented
	// param: UserID, Username, Email, PassWord, Department, Major, GradYear)
	public void insertUser(int id, String un, String em, String pw,
				  String dp, String mj, int gy) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO User (UserID, Username, Email, PassWord, Department, Major, GradYear) "
					+ "VALUES (" + id + ", '" + un + "', '" + em + "', '" + pw + "', '" + dp + "', '" + mj + "', " + gy + ")");
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// INSTEAD, use this:
	public void insertUser(String un, String em, String pw,
			  String dp, String mj, int gy) {
	if(checkUsername(un)) return;
	try {
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("INSERT INTO User (Username, Email, PassWord, Department, Major, GradYear) "
				+ "VALUES ('" + un + "', '" + em + "', '" + pw + "', '" + dp + "', '" + mj + "', " + gy + ")");
		}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	// DISCOURAGED to use since DB should have RatingID auto incremented
	// param: RatingID, Rating Value, SenderID, LocationID, RatingContent, QuietnessRatingValue, CleanessRatingValue
	public void insertRating(int id, int rv, int sid, int lid, String rc, int qrv, int crv) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Rating (RatingID, RatingValue, SenderID, LocationID, RatingContent, QuietnessRatingValue, CleanessRatingValue) "
					+ "VALUES (" + id + ", " + rv + ", " + sid + ", " + lid + ", '" + rc + "', " + qrv + ", " + crv + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// INSTEAD, use this:
	// param: Rating Value, SenderID, LocationID, RatingContent, QuietnessRatingValue, CleanessRatingValue
	public void insertRating(int rv, int sid, int lid, String rc, int qrv, int crv) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Rating (RatingValue, SenderID, LocationID, RatingContent, QuietnessRatingValue, CleanessRatingValue) "
					+ "VALUES (" + rv + ", " + sid + ", " + lid + ", '" + rc + "', " + qrv + ", " + crv + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// param: Rating Value, SenderID, LocationID, RatingContent
	public void insertRating(int rv, int sid, int lid, String rc) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Rating (RatingValue, SenderID, LocationID, RatingContent) "
					+ "VALUES (" + rv + ", " + sid + ", " + lid + ", '" + rc + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// DISCOURAGED to use since DB should have LocationID auto incremented
	// param: LocationID, LocationName
	public void insertLocation(int lid, String lName){
		if(checkLocation(lName)) return;
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Location (LocationID, LocationName) "
					+ "VALUES (" + lid + ", '" + lName + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// INSTEAD, use this:
	// param: LocationName
	public void insertLocation(String lName){
		if(checkLocation(lName)) return;
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Location (LocationName) "
					+ "VALUES ('" + lName + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DISCOURAGED to use since DB should have ForumMessageID auto incremented
	// param: ForumMessageID, SenderID, LocationID, Content
	public void insertForumMessage(int id, int sid, int lid, String c) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO ForumMessage (ForumMessageID, SenderID, LocationID, MessageContent) "
					+ "VALUES (" + id + ", " + sid + ", " + lid + ", '" + c + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// INSTEAD, use this:
	// param: SenderID, LocationID, Content
	public void insertForumMessage(int sid, int lid, String c) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO ForumMessage (SenderID, LocationID, MessageContent) "
					+ "VALUES (" + sid + ", " + lid + ", '" + c + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// param: Username, PassWord
	public boolean checkUser(String un, String pw) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Username = '" + un + "' AND PassWord = '" + pw + "'");
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// param: Username
	public boolean checkUsername(String un) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Username = '" + un + "'");
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// param: Email
	public boolean checkEmail(String em) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Email = '" + em + "'");
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// param: locationName
	public boolean checkLocation(String locationName){
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Location WHERE LocationName = '" + locationName + "'");
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// param: Username
	public User getUser(String un) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Username = '" + un + "'");
			if (rs.next()) {
				return new User(rs.getInt("UserID"), rs.getString("Username"),
				 rs.getString("Email"), rs.getString("PassWord"),
				   rs.getString("Department"), rs.getString("Major"),
				    rs.getInt("GradYear"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// display ratings for one location
	public ArrayList<Rating> getRatings(int lid) {
		ArrayList<Rating> ratings = new ArrayList<Rating>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Rating WHERE LocationID = " + lid);
			while (rs.next()) {
				Rating rating = new Rating(rs.getInt("RatingID"), rs.getInt("RatingValue"),
				 rs.getInt("SenderID"), rs.getInt("LocationID"), rs.getString("RatingContent"),
				  rs.getInt("QuietnessRatingValue"), rs.getInt("CleanessRatingValue"));
				ratings.add(rating);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ratings;
	}

	// display forum messages for one location
	public ArrayList<ForumMessage> getForumMessages(int lid) {
		ArrayList<ForumMessage> forumMessages = new ArrayList<ForumMessage>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ForumMessage WHERE LocationID = " + lid);
			while (rs.next()) {
				ForumMessage forumMessage = new ForumMessage(rs.getInt("MessageID"), rs.getInt("SenderID"),
					rs.getString("MessageContent"), rs.getInt("LocationID"));
				forumMessages.add(forumMessage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return forumMessages;
	}

	public ArrayList<ForumMessage> getAllForumMessages() {
		ArrayList<ForumMessage> forumMessages = new ArrayList<ForumMessage>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ForumMessage");
			while (rs.next()) {
				ForumMessage forumMessage = new ForumMessage(rs.getInt("MessageID"), rs.getInt("SenderID"),
					rs.getString("MessageContent"), rs.getInt("LocationID"));
				forumMessages.add(forumMessage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return forumMessages;
	}

	public ArrayList<Location> getLocations() {
		ArrayList<Location> locations = new ArrayList<Location>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Location");
			while (rs.next()) {
				// loc id, loc name
				Location location = new Location(rs.getString("Name"), rs.getInt("LocationID"));
				locations.add(location);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return locations;
	}

	// Some helper functions

	// getUserID from username
	public int getUserID(String un) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM User WHERE Username = '" + un + "'");
			if (rs.next()) {
				return rs.getInt("UserID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	// getLocationID from locationName
	public int getLocationID(String locationName) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Location WHERE LocationName = '" + locationName + "'");
			if (rs.next()) {
				return rs.getInt("LocationID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}


	public static void main (String[] args) {
		System.out.println("This is the unit test to check we have connected to mySQL correctly.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user: (usually it is called root)");
		String user = sc.nextLine();
		System.out.println("Enter your password: (your password set for your DB)");
		String password = sc.nextLine();
		JDBC j = new JDBC(user, password);
		j.createDB();
		j.insertUser("frank", "frankhe@usc.edu", "fffhhheee", "CS", "CSCI", 2025);
		j.insertLocation("Leavey");
		System.out.println(j.checkUser("frank", "fffhhheee"));
		System.out.println(j.checkUser("jacob", "jacobobob"));
		System.out.println(j.checkUsername("frank"));
		System.out.println(j.checkUsername("jacob"));
		j.insertRating(5, j.getUserID("frank"), j.getLocationID("leavey"), "goodgood", 0, 0);
		j.insertForumMessage(j.getUserID("frank"), j.getLocationID("leavey"), "Such a good place to study!");
		System.out.println(j.getAllForumMessages());
		sc.close();
	}
}
