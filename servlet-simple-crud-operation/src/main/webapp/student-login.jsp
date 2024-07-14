
<%@page import="jakarta.servlet.http.HttpSession"%>
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
			String msg = (String)request.getAttribute("msg");
			HttpSession httpSession = request.getSession();
			
%> 


<%if(httpSession.getAttribute("studentSession")!=null) { %>
 <%
 		request.setAttribute("msg","session time out you are logged out");
 		
 		httpSession.invalidate();
 
 %>
    <%} %>
    
    <div style="width: 300px; margin: 100px auto; padding: 20px; background-color: #fff; border-radius: 5px; box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);">
        <h2 style="text-align: center; color: #333;">Login</h2>
        
        
        <form action="loginStudent" method="post">
        
        		<%if(msg!=null){ %>
        		    <h5 style="color:red"><%= msg %></h5>
        		<%} %>
            <div style="margin-bottom: 20px;">
                <label for="username" style="display: block; margin-bottom: 5px; color: #666;">Username:</label>
                <input type="text" id="username" name="username" style="width: calc(100% - 10px); padding: 10px; border: 1px solid #ccc; border-radius: 3px;" required>
            </div>
            <div style="margin-bottom: 20px;">
                <label for="password" style="display: block; margin-bottom: 5px; color: #666;">Password:</label>
                <input type="password" id="password" name="password" style="width: calc(100% - 10px); padding: 10px; border: 1px solid #ccc; border-radius: 3px;" required>
            </div>
            <button type="submit" style="width: 100%; padding: 10px; background-color: #007bff; color: #fff; border: none; border-radius: 3px; cursor: pointer; transition: background-color 0.3s;">Login</button>
       
       
        </form>
    </div>
</body>
</html>