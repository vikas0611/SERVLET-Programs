package com.jspider.simple_java_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



//ctrl+shit+O ---> all required import will come
//ctrl+shit+F --->to allign all the fonts
// shortcut keys of eclipse  ............... (Turing.com )

public class InsertTeacherController {

	public static void main (String[] args)
	{
	 Connection connection = null;
		
		try {
			//s1- load or register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//s-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/vikas";
			String user = "root"; 
			String pass = "Prachi@99104";
			
			 connection = DriverManager.getConnection(url, user, pass); 
			 //ctrl+space --->  to remove syntactical error
				//(url, user, pass)---> should be in same oder or error will come ==> callerSensitive
			
			/*
			 * s-3 create statement (we can achieve in 3 ways 
			 * Statement,prepared Statement,Callable Statement)
			 * 
			 * how to find class not found exception 
			 *   ---->right click --> properties--> build path --> properties --> check class Path  === > if not connector jar file then add it, or check the spelling of the code.
			 
			 * 1st0 Statement
			 */
			Statement statement = connection.createStatement();
			
			String InserTeacherQuery= "insert into teacher values (124,'nazim','nz@gmail.com','ctdeyrctuui',50000,87878)";
			
			statement.executeUpdate(InserTeacherQuery);                      
			//s-4  execute Query
			/*
			 * Inset query  --> insert into + name
			 */
		
			
		}
		
		catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		} finally {
			//s-5 close the connection
			try {
				connection.close();
			} 	catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
