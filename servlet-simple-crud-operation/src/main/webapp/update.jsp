<%@page import="com.jsp.servlet_simple_crud_operation.dto.Student"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
		StudentDao dao = new StudentDao();
		String email= (String)request.getParameter("email");
		Student student = dao.getStudentByEmailDao(email);
%>
<h3> Welcome to update Form</h3>

    <form action="studentUpdate">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="<%=student.getName()%>" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%=student.getEmail()%>" required><br><br>
        
        
           <label for="password">Password:</label>
        <input type="text" id="password" name="password" value="<%=student.getPassword()%>" required><br><br>

        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" required><br><br>

        <label>Degree:</label><br>
        <input type="radio" id="btech" name="degree" value="B.Tech">
        <label for="btech">B.Tech</label><br>
        <input type="radio" id="bca" name="degree" value="BCA">
        <label for="bca">BCA</label><br>
        <input type="radio" id="ba" name="degree" value="BA">
        <label for="ba">BA</label><br>
        <input type="radio" id="mca" name="degree" value="MCA"  <%if(student.getDegree().equalsIgnoreCase("mca")){ %>checked = "true"<% }%>>
        <label for="mca">MCA</label><br><br>

        <label>Branch:</label><br>
        <input type="radio" id="csit" name="branch" value="CS/IT" <%if(student.getBranch().equalsIgnoreCase("csit")){ %>checked = "true"<% }%>>
        <label for="csit">CS/IT</label><br> <span>
        <input type="radio" id="ece" name="branch" value="ECE" <%if(student.getBranch().equalsIgnoreCase("ece")){ %>checked = "true"<% }%>>
        <label for="ece">ECE</label><br> <span>
        <input type="radio" id="me" name="branch" value="ME" <%if(student.getBranch().equalsIgnoreCase("me")){ %>checked = "true"<% }%>>
        <label for="me">ME</label><br> <span>
        <input type="radio" id="civil" name="branch" value="Civil"  <%if(student.getBranch().equalsIgnoreCase("civil")){ %>checked = "true"<% }%>>
        <label for="civil">Civil</label><br><br> 
        
        <label>Gender:</label><br>
        <input type="radio" id="male" name="gender" value="Male" <%if(student.getGender().equalsIgnoreCase("male")){ %>checked = "true"<% }%>>
        <label for="male" >Male</label><br> <span>
        <input type="radio" id="female" name="gender" value="Female" <%if(student.getGender().equalsIgnoreCase("female")){ %>checked = "true"<% }%>>
        <label for="female" >Female</label><br><span>
        <input type="radio" id="others" name="gender" value="Others" <%if(student.getGender().equalsIgnoreCase("others")){ %>checked = "true"<% }%>>
        <label for="others" >Others</label><br><br>

        <input type="submit" value="update">
    </form>
</body>
</html>