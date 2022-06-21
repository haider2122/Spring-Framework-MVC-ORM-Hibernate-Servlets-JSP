<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@include file="./base_home.jsp" %>

<%@ page import="com.mvc.model.Books,java.util.*" %>
<%@ page isELIgnored="false" %>

<style>

</style>
<body>


<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="card">
                <div class="card-body text-center">
                    <h5 class="card-title m-b-0">Reading List</h5>
                </div>
                <div class="table-responsive">
                 <%
							List<Books> books=(List<Books>)request.getAttribute("books"); 
                        
                        %>
                 
                    <table class="table">
                        <thead class="thead-light">
                            <tr>
                                
                                <th scope="col">Book Id</th>
                                <th scope="col">Book Name</th>
                                <th scope="col">Author</th>
                                
                                <th scope="col">Status</th>
                                <th scope="col">Options</th>
                            </tr>
                        </thead>
                        
                       
                         	<%for(Books i : books){%>
                        <tbody class="customtable">
                     
                            <tr>
                    
                               
                                
             		    
				 						
             
                                				 
                                <td><%=i.getBid() %></td>
                                <td><%=i.getBname() %></td>
                                <td><%=i.getBauthor() %></td>
                                
                                <td><%=i.getBstatus() %></td>
                                 <td><a href="${pageContext.request.contextPath}/deleteBooks/<%=i.getBid() %>" > <button  type="button" class="btn btn-danger" >Delete </button></a>
                                <a href="${pageContext.request.contextPath}/accessNotes/<%=i.getBid()%>" > <button  type="button" class="btn btn-info" style="padding: 2 px;">Visit</button></a>
                                  </td>
                                 
           
                            </tr>
                         
                        </tbody>
                           <% } %>
                    </table>
                 
                </div>
            </div>
              <div class="container text-center">
                   <a href="${pageContext.request.contextPath}/addBooks" class="btn btn-outline-success">Add Books</a>
                   </div>
            
        </div>
    </div>
</div>


<div class="container">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Title</th>
      <th scope="col">Note</th>
      <th scope="col">Status</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
   
  </tbody>
</table>


   

</div>
</body>
</html>


