package Login.java.DBController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class search {
	public static ResultSet search_client() throws SQLException {
        Statement stmt = connectDB.DBStmt();
        ResultSet rs = null;
        
        String sql = "SELECT * from clients";

        rs = stmt.executeQuery(sql);
        
		return rs;
	}
}
