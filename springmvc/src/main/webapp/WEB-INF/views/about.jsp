<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About Page called from Controller</title>
</head>
<body>


<%@page isELIgnored="false" %> <!-- enabling Exp language in jsp -->


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%

String name=(String)request.getAttribute("name");//one way pf doing it

%>
<h2>Hi, my name is : <%=name %>

<br>
Id: ${id}
<br>
My interests
<c:forEach var="i" items="${interests}" >

<c:out value="i"> </c:out>  <!-- printing using jstl -->
</c:forEach>

</h2>



</body>
</html>