package DBController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Login.java.DBController.connectDB;

public class searchFromDB {
	public static ResultSet search_client() throws SQLException {
        Statement stmt = connectDB.DBStmt();
        ResultSet rs = null;
        
        String sql = "SELECT * from table_name";

        rs = stmt.executeQuery(sql);
        
		return rs;
	}
}
