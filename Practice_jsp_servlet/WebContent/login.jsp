<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Login_Servlet">

UserName:<input type="text" name="username"><br><br>
		

Password:<input type="password" name="pass"><br><br>

<input type="submit">

</form>

<%--   <%

String message =request.getAttribute("message").toString();
if(message!=null){
out.println(message);
request.removeAttribute("message");
}

%>   --%>
</body>
</html>