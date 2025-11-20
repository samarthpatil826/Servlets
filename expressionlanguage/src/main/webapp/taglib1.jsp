<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>
--------------------------------------------------------------------------
<br>
<% 
  session.setAttribute("isWorking", true);
%>

<!-- it will help us to print value -->
<c:out value="${isWorking}"></c:out> 
<br>                                   
--------------------------------------------------------------------------

<!-- it will help us to store value inside container -->
<c:set var="gender" value="Male"></c:set>
<h4><c:out value="${gender }"></c:out></h4>
<br>
---------------------------------------------------------------------------

<c:set var="age" value="24"></c:set>

<!-- it will work like a decision if statement -->

<c:if test="${age>=18}">
  <h2>Eligible for Vote</h2>
</c:if>
---------------------------------------------------------------------------
<br>

<c:set var="number" value="80"></c:set>

<!-- it will work like a decision if else statement -->
<c:choose>
   <c:when test="${number>=35}">
      <h1>Pass</h1>
   </c:when>
   
   <c:otherwise>
      <h1>Fail</h1>
   </c:otherwise>
</c:choose>

---------------------------------------------------------------------------
<br>

<c:set var="number" value="60"></c:set>

<!-- it will work like a decision if else-if ladder statement -->
<c:choose>
   <c:when test="${number>=80}">
      <h1>First Class</h1>
   </c:when>
   
    <c:when test="${number>=50 && number<80}">
      <h1>Second Class</h1>
   </c:when>
   
    <c:when test="${number>=35 && number<50}">
      <h1>Third Class</h1>
   </c:when>
   
   <c:otherwise>
      <h1>Fail</h1>
   </c:otherwise>
</c:choose>

--------------------------------------------------------------------------------
<br>

<!-- it will work like for each loop -->
<c:forEach var="i" begin="1" end="5">

  <h1><c:out value="${ i}"></c:out></h1>

</c:forEach>
--------------------------------------------------------------------------------
</body>
</html>