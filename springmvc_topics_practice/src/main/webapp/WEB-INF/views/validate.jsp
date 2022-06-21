<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page isELIgnored="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- using taglib for static resources -->

<body>
<h1>Validate Form</h1>
<br>
<h2>${user}</h2>

<h3>
 <%String mssg=request.getParameter("message");
 out.println(mssg);
 %>

<%-- <link href="<c:url value="/resources/css/style.css"/>"/> --%>
</h3>
</body>
</html>