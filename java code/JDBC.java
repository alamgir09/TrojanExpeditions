package final_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC {
	static String user = null;
	static String password = null;
	static Connection conn = null;
	public static void connect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user: (usually it is called root)");
		user = sc.nextLine();
		System.out.println("Enter your password: (your password set for your DB");
		password = sc.nextLine();
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Ratingapp?user=" + user +
				 "&password=" + password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	public static void createDB(){
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
					+ "`LocationID` int NOT NULL,"
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
					+ "`MessageID` int NOT NULL,"
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
					+ "`RatingID` int NOT NULL,"
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
					+ " `UserID` int NOT NULL,"
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

	public static void insertUser(int id, String un, String em, String pw,
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

	public static void insertRating(int id, int rv, int sid, int lid, String rc, int qrv, int crv) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Rating (RatingID, RatingValue, SenderID, LocationID, RatingContent, QuietnessRatingValue, CleanessRatingValue) "
					+ "VALUES (" + id + ", " + rv + ", " + sid + ", " + lid + ", '" + rc + "', " + qrv + ", " + crv + ")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertLocation(int lid, String lName){
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Location (LocationID, LocationName) "
					+ "VALUES (" + lid + ", '" + lName + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void insertForumMessage(int id, int sid, int lid, String c, String t) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO ForumMessage (ForumMessageID, SenderID, LocationID, Content, Time) "
					+ "VALUES (" + id + ", " + sid + ", " + lid + ", '" + c + "', '" + t + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean checkUser(String un, String pw) {
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

	public static boolean checkUsername(String un) {
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

	public static boolean checkEmail(String em) {
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

	public static boolean checkLocation(String locationName){
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Location WHERE Name = '" + locationName + "'");
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public static User getUser(String un) {
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
	public static ArrayList<Rating> getRatings(int lid) {
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
	public static ArrayList<ForumMessage> getForumMessages(int lid) {
		ArrayList<ForumMessage> forumMessages = new ArrayList<ForumMessage>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM ForumMessage WHERE LocationID = " + lid);
			while (rs.next()) {
				ForumMessage forumMessage = new ForumMessage(rs.getInt("ForumMessageID"), rs.getInt("SenderID"),
					rs.getString("Content"), rs.getInt("LocationID"));
				forumMessages.add(forumMessage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return forumMessages;
	}

	public static ArrayList<Location> getLocations() {
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


	// public static void main (String[] args) {
	// 	Connection conn = null;
	// 	Statement st = null;
	// 	PreparedStatement ps = null;
	// 	ResultSet rs = null;
	// 	try {
	// 		st = conn.createStatement();
	// 		rs = st.executeQuery("select Classname, COUNT(Classname) as `Number of students`\r\n"
	// 				+ "from studentinfo natural join grades\r\n"
	// 				+ "group by Classname\r\n"
	// 				+ "order by COUNT(classname);");
	// 		while (rs.next()) {
	// 			System.out.println(rs.getString("classname") + ' ' + rs.getString("number of students"));
	// 		}
	// 		System.out.println();

	// 		rs = st.executeQuery("Select * from studentinfo natural join grades");
	// 		while (rs.next()) {
	// 			System.out.println(rs.getString("classname") + ' ' + rs.getString("name") + ' ' + rs.getString("grade"));
	// 		}
	// 	} catch (SQLException sqle) {
	// 		System.out.println ("SQLException: " + sqle.getMessage());
	// 	} finally {
	// 		try {
	// 			if (rs != null) {
	// 				rs.close();
	// 			}
	// 			if (st != null) {
	// 				st.close();
	// 			}
	// 			if (ps != null) {
	// 				ps.close();
	// 			}
	// 			if (conn != null) {
	// 				conn.close();
	// 			}
	// 		} catch (SQLException sqle) {
	// 			System.out.println("sqle: " + sqle.getMessage());
	// 		}
	// 	}
	// }
}