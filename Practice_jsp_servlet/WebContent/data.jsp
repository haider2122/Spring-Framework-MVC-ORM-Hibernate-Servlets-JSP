<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% 
 response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null )
{
	response.sendRedirect("login.jsp");

}

%> 

<br>
This is the data page
<%

out.println("Welcome	"+session.getAttribute("username"));

%>

<form action="Logout_Servelet">


<input type="submit" value="logout" >

</form>
<br>
</body>
</html>