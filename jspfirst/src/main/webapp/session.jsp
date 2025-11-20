<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
 session.setAttribute("user","postgres");
%>

<h1>Username is : <%= session.getAttribute("user") %></h1>

</body>
</html>