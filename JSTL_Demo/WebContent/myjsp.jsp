<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  --%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
Hello

<%
 String str=request.getAttribute("name").toString();
out.println(str);

%>
<%-- <%-- <c:out value="asjs" />  --%>

My name is: ${name}, Printing this using Expressions 
</body>
</html>