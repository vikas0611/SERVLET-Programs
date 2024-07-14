package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")

@WebServlet(value = "/delete")

public class DeleteStudentController extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession();
		
		
		
		
		StudentDao dao = new StudentDao();
		String email = req.getParameter("email");
		
		String str = (String) httpSession.getAttribute("studentSession");
		if(str!=null) {
		dao.deleteStudentByEmail(email);
		
		System.out.println(email);      
		
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		} else {
			
			req.setAttribute("msg", "please login an then delete");
			req.getRequestDispatcher("student-login.jsp").forward(req, resp);
		}
		
	
	
	}

}
