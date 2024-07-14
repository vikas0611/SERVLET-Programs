package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;









@WebServlet(value = "/studentUpdate")
public class StudentUpdateController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		
		

	 	String name = req.getParameter("name");
		String email = req.getParameter("email");
		String degree = req.getParameter("degree");
		String branch = req.getParameter("branch");
		String gender = req.getParameter("gender");
		String password =  req.getParameter("password");
		
		
		Student student = new Student(name, email, degree, branch, gender, password) ;

			dao.updateStudentByEmailDao(student);
			
			
			req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
	
	
	
	

	
	
}
