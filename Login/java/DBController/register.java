package Login.java.DBController;

import java.sql.SQLException;
import java.sql.Statement;

public class register {
	public static void registerClient(String ID, String PASS) throws SQLException {
		Statement stmt = connectDB.DBStmt();
		
		String sql = "Insert into clients (id,password) values (\""+ID+"\",\""+PASS+"\")";
		stmt.executeUpdate(sql);
	}
}
