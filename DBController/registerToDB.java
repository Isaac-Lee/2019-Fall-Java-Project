package DBController;

import java.sql.SQLException;
import java.sql.Statement;

import Login.java.DBController.connectDB;

public class registerToDB {
	public static void registerClient(String ID, String PASS) throws SQLException {
		Statement stmt = connectDB.DBStmt();
		
		String sql = "Insert into table_name (id,password) values (\""+ID+"\",\""+PASS+"\")";
		stmt.executeUpdate(sql);
	}
}
