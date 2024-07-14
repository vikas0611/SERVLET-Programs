package com.jsp.servlet_simple_crud_operation.controller; 

import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.servlet_simple_crud_operation.dto.Student;
import com.jsp.servlet_simple_crud_operation.service.StudentService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class InsertStudentController implements Servlet { 

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		StudentService service = new StudentService();
		
	 	String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String degree = req.getParameter("degree");
		String branch = req.getParameter("branch");
		String gender = req.getParameter("gender");
		String password =  req.getParameter("password");
		
		
		Student student = new Student(name, email, degree, branch, gender, password) ;

		
		Student entry = service.saveStudentService(student);
		
		
		PrintWriter printWriter = res.getWriter();
		if (entry!=null) {
			
			
			//printWriter.write("name: " + name);
			printWriter.write("<html><body><h3 style='color:green'>Data Registered Successfully</h3></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("student-login.jsp");
			
			dispatcher.include(req,res);
			
			
		} else {
			
	
			//printWriter.write("name: " + name);
			printWriter.write("<html><body><h3 style='color:red'>Sorry, Data cannot be Registered</h3></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("student-register.jsp");
			
			dispatcher.include(req,res);
			
		}
		
		
	/*	System.out.println("Name : "  + name);
		System.out.println("Email : "  + email);
		System.out.println("Phone : "  + phone);
		System.out.println("Degree : "  + degree);
		System.out.println("Branch : "  + branch);
	 	System.out.println("Gender : "  + gender);
	 	System.out.println("----------------------------------------------------------------");
	*/
		
		
		
		 
		
		
		
	}
	
	
	
	
	

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
	}

}
