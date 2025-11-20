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
 int x=10;
 request.setAttribute("value", x);
%>

<h1>Value is : ${value}</h1>

</body>
</html>