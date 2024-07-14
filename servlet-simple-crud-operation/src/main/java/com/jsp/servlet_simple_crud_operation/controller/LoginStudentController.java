package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dto.Student;
import com.jsp.servlet_simple_crud_operation.service.StudentService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginStudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession httpSession = req.getSession();
		 
		StudentService service = new StudentService();

		String user = req.getParameter("username");
		String pass = req.getParameter("password");

		Student student = service.fetchStudentByEmailForLoginService(user);

		// PrintWriter printWriter = res.getWriter();

		if (student != null) {

			if (student.getPassword().equals(pass)) {
				httpSession.setAttribute("studemtSession",user);
				httpSession.setMaxInactiveInterval(30);
				req.getRequestDispatcher("home.jsp").forward(req, resp);

			} else {

				req.setAttribute("msg", "incorrect password");
				// printWriter.write("<html><body><h3 style='color:red'> Password is
				// incorrect</h3></body></html>");
				req.getRequestDispatcher("student-login.jsp").forward(req, resp);

			}

		} else {
			req.setAttribute("msg", "incorrect email");
			// printWriter.write("<html><body><h3 style='color:red'>Email is
			// Incorrect</h3></body></html>");
			req.getRequestDispatcher("student-login.jsp").forward(req, resp);

		}

	}

}
