<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<%@page isELIgnored="false" %> 

<!-- Fetching from @RequestParam -->
<%-- <h1>
${userName} <br>
${userEmail} <br>
${userPhone} <br>
</h1> --%>


<!-- Fetching values from user object that has been mapped by @ModelAttribute -->

<h1>
${user.userName} <br>
${user.userEmail} <br>
${user.userPhone} <br>
</h1>


</body>
</html>