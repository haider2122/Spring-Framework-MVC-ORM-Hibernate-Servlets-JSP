<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home JSP called from Controller</title>
</head>
<body>


<%
String web_name= (String)request.getAttribute("website_name");
String welcome_mssg= (String)request.getAttribute("welcome_message");


%>

<h1>This is <%=web_name %>></h1>
<br>
<h2><%=welcome_mssg %></h2>
</body>
</html>