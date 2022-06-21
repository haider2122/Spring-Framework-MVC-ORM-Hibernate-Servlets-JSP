<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>




<body>
<br>



<%@page import="com.project.Entities.Notes,java.util.*" %>
<%@page isELIgnored="false" %>
<%@include file="./base_addNotes.jsp" %>

<% List<Notes> notes=(List<Notes>) request.getAttribute("all_notes");%>

<br>
<br>
<div class="container">
<form onsubmit="event.preventDefault()" class="form-inline my-2 my-lg-0"> <input class="form-control mr-sm-2" type="text" placeholder="Search"> <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button> </form>
<table class="table">

	<h2 style="margin-left:450px;">ToDo List</h2>
	<br>
	
  <br>
  
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Title</th>
      <th scope="col">Note</th>
      <th scope="col">Status</th>
      <th scope="col">Options</th>
    </tr>
  </thead>
  <%for(Notes i:notes){ %>
  <tbody>
  
    <tr>
     <td><%=i.getNid() %></td>
      <td><%=i.getNheader() %></td>
      <td><%=i.getNnote()%></td>
      <td><%=i.getNstatus() %></td>
     <td><a href="${pageContext.request.contextPath}/deleteNote/<%=i.getNid() %>" > <button  type="button" class="btn btn-danger" >Delete </button></a> 
      
     </td>
    </tr>

  </tbody>
     <% }%>
</table>
  <div class="container text-center">
                   <a href="${pageContext.request.contextPath}/addNotes" class="btn btn-outline-success">Add Notes</a>
                   </div>
   </div>
  
   

</body>
</html>