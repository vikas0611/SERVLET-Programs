package com.jsp.servlet_simple_crud_operation.service;

import com.jsp.servlet_simple_crud_operation.dao.StudentDao;
import com.jsp.servlet_simple_crud_operation.dto.Student;

public class StudentService {

	StudentDao dao = new StudentDao();
	
	
	public Student saveStudentService(Student student) {
			return dao.saveStudentDao(student);
	}
	
	
	
	
	
	public Student fetchStudentByEmailForLoginService(String email) {
		return dao.fetchStudentByEmailForLoginService(email);
	}
	
	
		
	
	
	
	
	
}
