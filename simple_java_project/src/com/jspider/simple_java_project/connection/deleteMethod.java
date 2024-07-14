package com.jspider.simple_java_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;




public class DeleteTeacherController {

	public static void main (String[] args)
	{
	 Connection connection = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//s-2 Create Connection
			String url = "jdbc:mysql://localhost:3306/vikas";
			String user = "root"; 
			String pass = "Prachi@99104";
			
			 connection = DriverManager.getConnection(url, user, pass); 
			 
			
			 //Delete method to delete product
			 
			 public int deleteProductBydao(int productId) {
				
				 try {
					 String deleteQuery ="delete from product where id=?";
				]
			 }
			 
			Statement statement = connection.createStatement();
			
			String InserProductQuery= "delete from product where name=?";
			
			
			statement.executeUpdate(InserTeacherQuery);                      
			
			
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
