<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<header> <%@ include file="../template/header.jsp"%></header>

	<article>

	<div class="container">
	
	    <div class="form-group">
		  <label for="name">Name:</label>
		  <input type="text" name="name" class="form-control" id="name">		  		   
		</div>
	
	    <div class="form-group">
		  <label for="lastname">LastName:</label>
		  <input type="text" name="lastname" class="form-control" id="lastname">		  		   
		</div>
		
		    <div class="form-group">
		  <label for="email">Email:</label>
		  <input type="text" name="email" class="form-control" id="email">		  		   
		</div>
		
		    <div class="form-group">
		  <label for="name">Name:</label>
		  <input type="text" name="email" class="form-control" id="name">		  		   
		</div>
		
		    <div class="form-group">
		  <label for="age">Age:</label>
		  <input type="text" name="age" class="form-control" id="age">		  		   
		</div>
		
		    <div class="form-group">
		  <label for="usr">Address:</label>
		  <input type="text" name="Address" class="form-control" id="address">		  		   
		    </div>
		    
		     <div class="form-group">
		  <label for="password">Password:</label>
		  <input type="text" name="Address" class="form-control" id="password">		  		   
		    </div>
		    
		    
		     <div class="form-group">
		  <label for="confirm-password">Confirm-Password:</label>
		  <input type="text" name="confirm-password" class="form-control" id="confirm-password">		  		   
		    </div>
		
		
		<button class="btn btn-outline-primary">Register</button>
		<a class="btn btn-outline-danger"  href="../index.jsp" role="button">Cancel</a>
		
	</div>
	</article>

	<footer><%@ include file="../template/footer.jsp"%>
	</footer>


</body>
</html>