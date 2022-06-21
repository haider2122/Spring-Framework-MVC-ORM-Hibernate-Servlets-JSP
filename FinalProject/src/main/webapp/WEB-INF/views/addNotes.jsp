<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%@ page isELIgnored = "false" %>
<%@include file="./base_addNotes.jsp" %>
<form action="saveDetails" method="post">
<div class="container contact">
	<div class="row">
		
		<div class="col-md-12">
			<div class="contact-form">
			
				<div class="form-group">
				<h2 >Create Notes</h2>
				  <label class="control-label col-sm-2" for="fname">Title</label>
				  <div class="col-sm-10">          
					<input type="text" class="form-control" id="nheader" placeholder="What have you read? Or What do you plan to?" name="nheader">
				  </div>
				</div>
				<div class="form-group">
				  <label class="control-label col-sm-2" for="lname">Note</label>
				  <div class="col-sm-10">          
					<input type="text" class="form-control" id="nnote" placeholder="Enter the author name" name="nnote">
				  </div>
				</div>
				<div class="form-group">
				  <label class="control-label col-sm-2" >Status</label>
				  <div class="col-sm-10">
					<input type="text" class="form-control" id="nstatus" placeholder="Status?" name="nstatus">
				  </div>
				</div>
				
				<div class="form-group">   
				 
				    
				  <div class="col-sm-offset-2 col-sm-10">
				  <a href="${pageContext.request.contextPath}/home" class="btn btn-primary">
				 Cancel
				  </a>
					<button type="submit" class="btn btn-default">Submit</button>
				  </div>
				</div>
			</div>
		</div>
	</div>
</div></form>

</body>
</html>