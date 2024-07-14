package com.jsp.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.jsp.servlet_simple_crud_operation.connection.StudentConnection;
import com.jsp.servlet_simple_crud_operation.dto.Student;

public class StudentDao{

	
	
	Connection con = StudentConnection.getStudentConnection();
	
	 public Student saveStudentDao(Student st){
		 String Query = "INSERT INTO students(name,email,degree,branch,gender,password) VALUES(?,?,?,?,?,?)";
		 
	try {
		
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1,st.getName());
		ps.setString(2, st.getEmail());
		ps.setString(3,st.getDegree());
		ps.setString(4, st.getBranch());
		ps.setString(5, st.getGender());
		ps.setString(6, st.getPassword());
		ps.execute();
		return st;
		
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}	 
}
	 


		public Student fetchStudentByEmailForLoginService(String email) {
			 
			 String Query = "Select * FROM students where email=?";
			 	try {
					PreparedStatement ps = con.prepareStatement(Query);
					
					ps.setString(1, email);
					ResultSet resultSet = ps.executeQuery();
					resultSet.next();
					
						return new Student(resultSet.getString("email"), resultSet.getString("password"));
					
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					return null;
				}
				
				
			 	
	 }
	 
		
		
		public List<Student> getAllStudentDao(){
			
			String selectQuery = "SELECT * FROM students";
			
			try {
				PreparedStatement ps = con.prepareStatement(selectQuery);
				ResultSet set = ps.executeQuery();
				List<Student> students = new ArrayList<Student>();
				while(set.next()) {
					
					Student student = new Student(
							set.getString("name"),
							set.getString("email"),
							set.getString("degree"),
							set.getString("branch"),
							set.getString("gender"),
							set.getString("password")							
							);
					
				students.add(student);
				
				
				
				}
				return students;
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			
			}
			
			
		}
		
		
		
		public int deleteStudentByEmail(String email) {
			
			String deleteQuery = " DELETE FROM students where email =? ";
			
			
			
			try {
				PreparedStatement ps = con.prepareStatement(deleteQuery);
				ps.setString(1, email);
				return ps.executeUpdate();
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				return 0;
			
			}
			
			
			
			
			
			
		}
		
		
		
		public Student getStudentByEmailDao(String email) {
			 
			 String Query = "Select * FROM students where email=?";
			 	try {
					PreparedStatement ps = con.prepareStatement(Query);
					
					ps.setString(1, email);
					ResultSet set = ps.executeQuery();
					set.next();
					Student student = new Student(
							set.getString("name"),
							set.getString("email"),
							set.getString("degree"),
							set.getString("branch"),
							set.getString("gender"),
							set.getString("password")							
							);
			
						return student;
					
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					return null;
				}
			
		}
		
		
		public int updateStudentByEmailDao(Student st)
		{
			String updateQuery = 	"UPDATE students set name=?,degree=?,branch=?,gender=?,password=? where email=?";
			
		
		
			try {
				
				PreparedStatement ps = con.prepareStatement(updateQuery);
				ps.setString(1,st.getName());
				ps.setString(2,st.getDegree());
				ps.setString(3, st.getBranch());
				ps.setString(4, st.getGender());
				ps.setString(5, st.getPassword());
				ps.setString(6, st.getEmail());
				
				return ps.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}	 
		
		
		
		}





}