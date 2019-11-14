package DBController;

import java.sql.Statement;

public class insertIntoDB {
	public static boolean addClient(String ID, String Pass) {
		try {
			Statement 	stmt = connectToDB.DBStmt();
			String 		sql = "Insert into Member (ID,Password,nowUse) values (\"" + ID + "\",\"" + Pass + "\",\"" + "0" + "\")";
			stmt.executeUpdate(sql);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean addManager(String ID, String Pass) {
		try {
			Statement 	stmt = connectToDB.DBStmt();
			String 		sql = "Insert into Manager (ID,Password,nowUse) values (\"" + ID + "\",\"" + Pass + "\",\"" + "0" +"\")";
			stmt.executeUpdate(sql);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean addScooter(String ID, String Location) {
		try {
			Statement 	stmt = connectToDB.DBStmt();
			String 		sql = "Insert into Manager (ID,Location,nowUse) values (\"" + ID + "\",\"" + Location + "\",\"" + "0" +"\")";
			stmt.executeUpdate(sql);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
