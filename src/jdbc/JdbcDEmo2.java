package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDEmo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Register to driver
		// Class.forName("com.mysql.cj.jdbc.Driver"); // not required for latest versions 8.0+ 
		// connection URL : jdbc:mysql://{HOST}[:{PORT}][/{DB}]

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","training","Training@123");

		//statement
		 PreparedStatement pstmt = conn.prepareStatement("insert into dept values (?,?,?);");
		 pstmt.setInt(1, 10);
		 pstmt.setString(2, "xyz");			
		 pstmt.setString(3, "Bhuvaneshwar");
		 int result = pstmt.executeUpdate();
		 System.out.println(result);
		 
		conn.close();
	}
}
