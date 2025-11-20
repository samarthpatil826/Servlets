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

String fname= request.getParameter("fname");
String lname= request.getParameter("lname");
String age = request.getParameter("age");
String loc= request.getParameter("location");
String mob= request.getParameter("contact");
String mail = request.getParameter("mail");
String gender= request.getParameter("gender");
String role = request.getParameter("role");
String date= request.getParameter("yoj");

%>



<%="First Name "+fname %>
<%="Last Name "+lname %>
<%="Age "+age %>
<%= "Location "+loc %>
<%= "Mobile Number "+mob %>
<%= "Email id "+mail %>
<%= "Gender "+gender %>
<%= "Role "+role %>
<%= "Date of Joining "+date %>



</body>
</html>