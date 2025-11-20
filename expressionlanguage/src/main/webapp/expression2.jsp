<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>

<%
String name= request.getParameter("name");
request.setAttribute("uname", name);
%>

<h1> Name is : ${uname}</h1>

</body>
</html>