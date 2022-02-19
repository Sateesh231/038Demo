package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDEmo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Register to driver
		// Class.forName("com.mysql.cj.jdbc.Driver"); // not required for latest versions 8.0+ 
		// connection URL : jdbc:mysql://{HOST}[:{PORT}][/{DB}]

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","training","Training@123");

		//statement
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept");
		//print use in login ..on ur logic
		while (rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));	
		}
	//	int result = stmt.executeUpdate("insert into dept values (10,'xyz','bhuvaneshwar');");
	//	int result = stmt.executeUpdate("update dept set loc='mysore' where dname='xyz';");
	//	int result = stmt.executeUpdate("delete from dept where dname='xyz';");
	//	System.out.println(result + " Rows affected");		
		conn.close();
	}
}
