<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>Student Information Form</h2>
    <form action="submited">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        
        
           <label for="password">Password:</label>
        <input type="text" id="password" name="password" required><br><br>

        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" required><br><br>

        <label>Degree:</label><br>
        <input type="radio" id="btech" name="degree" value="B.Tech">
        <label for="btech">B.Tech</label><br>
        <input type="radio" id="bca" name="degree" value="BCA">
        <label for="bca">BCA</label><br>
        <input type="radio" id="ba" name="degree" value="BA">
        <label for="ba">BA</label><br>
        <input type="radio" id="mca" name="degree" value="MCA">
        <label for="mca">MCA</label><br><br>

        <label>Branch:</label><br>
        <input type="radio" id="csit" name="branch" value="CS/IT">
        <label for="csit">CS/IT</label><br> <span>
        <input type="radio" id="ece" name="branch" value="ECE">
        <label for="ece">ECE</label><br> <span>
        <input type="radio" id="me" name="branch" value="ME">
        <label for="me">ME</label><br> <span>
        <input type="radio" id="civil" name="branch" value="Civil">
        <label for="civil">Civil</label><br><br> 
        
        <label>Gender:</label><br>
        <input type="radio" id="male" name="gender" value="Male">
        <label for="male">Male</label><br> <span>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label><br><span>
        <input type="radio" id="others" name="gender" value="Others">
        <label for="others">Others</label><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>