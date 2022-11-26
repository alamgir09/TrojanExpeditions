package final_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
			// `LastName` varchar(50) DEFAULT NULL,
			// `FirstName` varchar(50) DEFAULT NULL,
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
					+ " `LastName` varchar(50) DEFAULT NULL,"
					+ " `FirstName` varchar(50) DEFAULT NULL,"
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
				 String ln, String fn, String dp, String mj, int gy) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO User (UserID, Username, Email, PassWord, LastName, FirstName, Department, Major, GradYear) "
					+ "VALUES (" + id + ", '" + un + "', '" + em + "', '" + pw + "', '" + ln + "', '" + fn + "', '" + dp + "', '" + mj + "', " + gy + ")");
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
	
	public static void insertLocation(int id, String n, String a, String c, String s, String z, String t, String d, String p, String w, String h, String o, String l, String r, String i) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO Location (LocationID, Name, Address, City, State, Zip, Type, Description, Phone, Website, Hours, Other, Lat, Lng, Image) "
					+ "VALUES (" + id + ", '" + n + "', '" + a + "', '" + c + "', '" + s + "', '" + z + "', '" + t + "', '" + d + "', '" + p + "', '" + w + "', '" + h + "', '" + o + "', '" + l + "', '" + r + "', '" + i + "')");
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