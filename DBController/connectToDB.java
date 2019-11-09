package DBController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectToDB {
	public static Statement DBStmt() {
		Connection 	conn = null;
		Statement 	stmt = null;
		try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost/db_name";
            conn = DriverManager.getConnection(url, "username", "password");

            stmt = conn.createStatement();
        }
        catch( ClassNotFoundException e){
            System.out.println("Driver Loading Failed");
        }
        catch( SQLException e){
            System.out.println("Error " + e);
        }
		
		return stmt;
	}
}
