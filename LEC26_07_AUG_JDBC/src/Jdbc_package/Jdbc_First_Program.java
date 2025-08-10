package Jdbc_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_First_Program {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		{
		
		//step-1
//		Class.forName(" com.mysql.cj.jdbc.Driver");
		
		//step -2
		
		String url ="jdbc:mysql://localhost:3306/jdbcproject";
		String username="root";
		String password="root";
		
		 Connection con=   DriverManager.getConnection(url,username,password);
		 
		 Statement stm = con.createStatement();
		 
//		 String query ="create database jdbcproject";
//		 stm.execute(query);
		 
//		 String createTable = "create table Student(rollNo int, name varchar(100))";
//		 stm.execute(createTable);
		 
		 
//		 String insertData = "insert into student(rollNo,name) values(1,'wasif')";
//		 stm.execute(insertData);
		 
		 System.out.println("Enter the RollNo");
		 int rollno = sc.nextInt();
//		 System.out.println("Enter the Name");
//		 String name = sc.next();
		 
//		 String userInputData = "insert into student(rollNo,name) values(" + rollno + ",'" + name + "')";
//		 
//		stm.execute(userInputData);
		 
//		 String userInputUpdate = "update student set name='"+ name +	"' where rollNo=" + rollno;	
//		 stm.execute(userInputUpdate);
		 
		 
		 String deleteRow = "delete from student where rollNo="+ rollno;
		 stm.execute(deleteRow);
		
		 
		 
		 
		 stm.close();
		}
	}

}
