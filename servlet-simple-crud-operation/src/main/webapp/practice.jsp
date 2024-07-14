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




 <!-- scriptlet  -->
 
 
 
   <% for(int i = 0; i<=10;i++) {%>
   
   								<%if (i%2 == 0){ %>
   <!-- Expression tag -->
   			                         <p style="red"><%=i%> </p>
   
   <%} else{%>
   <p style ="green"> <%=i %></p>
   <%} %> 
   <%} %>
   
   
   <%! public String getTodayDate(){
	   return "today date is "+LocalDate.now();
	    
   }  %> 
     
     <% String date = getTodayDate(); %>
     
     
     <h3><%=date %></h3>
     
     
     <% StudentDao dao = new StudentDao();
     			Student st = dao.fetchStudentByEmailForLoginDao("");
     			
     			
     %>
  
  <p><%=st.getEmail() %>
  <p><%=st.getPassword()%></p>
  
  
</body>
</html>