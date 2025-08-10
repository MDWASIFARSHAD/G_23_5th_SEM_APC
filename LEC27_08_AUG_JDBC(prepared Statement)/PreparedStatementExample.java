package Jdbc_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {
	
	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/jdbcproject";
		String username="root";
		String password="root";
		
		 Connection con=   DriverManager.getConnection(url,username,password);
		 
//		 Statement stm = con.createStatement();
		 
		 PreparedStatement ps = con.prepareStatement("insert into student(rollNo,name) values(?,?)");
		 
		 
		 ps.setInt(1, 100);
		 ps.setString(2, "vansh");
		 ps.executeUpdate();
		 
		 ps.setInt(1, 101);
		 ps.setString(2, "samar");
		 ps.executeUpdate();
		 
		 ps.setInt(1, 102);
		 ps.setString(2, "sam");
		 ps.executeUpdate();
		 
		 ps.setInt(1, 103);
		 ps.setString(2, "amar");
		 ps.executeUpdate();
		 
		 ps.setInt(1, 104);
		 ps.setString(2, "cat");
		 ps.executeUpdate();
		 
	}

}
