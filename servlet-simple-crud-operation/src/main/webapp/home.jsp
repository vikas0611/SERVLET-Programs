<%@page import="java.util.List"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.StudentDao"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        .delete-button {
            background-color: red;
            color: white;
            border: none;
            cursor: pointer;
            padding: 8px 16px;
            border-radius: 4px;
        }
        .update-button {
            background-color: yellow;
            color: black;
            border: none;
            cursor: pointer;
            padding: 8px 16px;
            border-radius: 4px;
        }
    </style>

</head>
<body>
<%
			StudentDao dao = new StudentDao();
			List<Student> students = dao.getAllStudentDao();

%>

<h1>Welcome to Home Page</h1>

			<a href="student-login.jsp"> logout</a>

	<table border ="2">
				<tr>	
				<th> EMAIL:</th>
				<th>NAME:</th>
				<th>GENDER:</th>
				<th>BRACNCH:</th>  
				<th>DEGREE:</th>
				<th>PASSWORD:</th>
				<th colspan="2">ACTION:</th>
				</tr>
				
				<% for(Student student:students) {%>
				
				<tr>	
				<th> <%=student.getEmail()%></th>
				<th> <%=student.getName()%></th>
				<th><%=student.getGender()%></th>
				<th><%=student.getDegree()%></th>
				<th><%=student.getBranch()%></th>
				<th><%=student.getPassword()%></th>
				<th > <a href ="delete?email=<%=student.getEmail()%>" ><button style = "background-color:red; cursor:pointer"> DELETE</button></a></th>
				<th> <a href ="update.jsp?email=<%=student.getEmail()%>" ><button style ="background-color:yellow; cursor:pointer"> UPDATE</button> </a></th>
			
				<%} %>
				</tr>
				
				
				
				
				
				
				
	</table>

</body>
</html>