<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="readdata.jsp">

First Name : <input type="text" name="fname"><br>
Last Name : <input type="text" name="lname"><br>
Age : <input type="number" name="age"><br>
Location : <input type="text" name="location"><br>
Mobile No : <input type="number" name="contact"><br>
Email : <input type="text" name="mail"><br>
Gender : <input type="radio" value="male" name="gender">Male
         <input type="radio" value="female" name="gender">Female <br>
Role : <input type="text" name="role"><br>
Date Of Joining : <input type="date" name="yoj"><br>

<input type="submit" value="submit">

</form>

</body>
</html>