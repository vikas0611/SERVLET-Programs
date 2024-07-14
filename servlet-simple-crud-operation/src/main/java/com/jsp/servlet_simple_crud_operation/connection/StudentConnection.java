package com.jsp.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class StudentConnection {
	
	public static Connection getStudentConnection() {
		
		
		
		
		try {
			
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			 String url = "jdbc:mysql://localhost:3306/vikas";
				String user = "root";
				String pass = "Prachi@99104";
				
			Connection con = DriverManager.getConnection(url, user, pass);
			  
			return con;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

}
