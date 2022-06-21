<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='green'>
<p> Hello</p>

<%@ page import="java.util.*,java.util.Date,java.util.Collections" %>



<%@ page errorPage="handling_exception.jsp"  %>
<%!//Declarative tag
int a=10;
public String check(String u, String p){
	
	if(u.equals("haider") && p.equals("haider110")){
		return "You are logged in";
	}else{
		return "Wrong Username or Password";
		
	}
	
	
}

%>
<!--tanglib is for your own tags, or any other tags such as that of spring  -->
<%@ include file="header.jsp" %>
<br>
<br>
<br>
<br>
<%//Code inside service

String u= request.getParameter("username");//Objects DIrectly created and provided by tomcat
String p= request.getParameter("password");

out.println(check(u,p));

out.println("Value of a from delcarative tags--outside sevvice function:"+this.a);


%>
<br>
<br>
<%="This is the expression Tag"//out.println() 
%>
</body>
</html>