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
int [] ar={1,2,3,4,5};
%>

<%-- <%
for(int a:ar)
{
%>
<h1> <%=a %></h1>
<br>

<%
}
%> --%>

<%
for(int a:ar){
	out.print(a);
	
}
%>

</body>
</html>