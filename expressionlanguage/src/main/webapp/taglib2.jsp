<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="sammy"></c:set>

<h1>Length of String is : <c:out value="${fn:length(str) }"></c:out></h1>


------------------------------------------------------------------------


<c:set var="str" value="JaVa"></c:set>

<h1><c:out value="${fn:toLowerCase(str) }"></c:out></h1>


-------------------------------------------------------------------------


<c:set var="str" value="JaVa"></c:set>

<h1><c:out value="${fn:toUpperCase(str) }"></c:out></h1>


---------------------------------------------------------------------------


<c:set var="city" value="Pune"></c:set>

<h1><c:out value="${fn:contains(city,'P') }"></c:out></h1>


----------------------------------------------------------------------------


<c:set var="str" value="fruit"></c:set>

<h1><c:out value="${ fn:indexOf(str, 'u') }"></c:out></h1>


----------------------------------------------------------------------------


<c:set var="message" value="hello everyone"></c:set>
<h1><c:out value="${fn:substring(message, 0, 3) }"></c:out></h1>


---------------------------------------------------------------------------------


<c:set var="change" value="i love java"></c:set>
<h1><c:out value="${ fn:replace(change, 'j', 'J')  }"></c:out></h1>

</body>
</html>