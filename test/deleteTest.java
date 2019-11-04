package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement stmt = null;

        
        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mysql://localhost/mydb";
        conn = DriverManager.getConnection(url, "root", "tizm**423");

        stmt = conn.createStatement();
        String name = "Troy";
        String sql = "delete from table1 where name=\""+name+"\"";

        stmt.executeUpdate(sql);
	}
}
