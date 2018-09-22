<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.irving.model.* , util.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <!-- <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> -->

</head>
<body>

<header> <%@ include file="../template/header.jsp"%></header>
<script src="../resources/js/scripts.js" ></script>

<article>
<div class="container">
<div class="jumbotron" >

<h1>Home</h1>
<table class="table" >
<thead> 
       <tr> 
       <th scope="col">Id</th>
       <th scope="col">Name</th>
       <th scope="col">Last Name</th>
       <th scope="col">Email</th>
       <th scope="col">Age</th>
       <th scope="col">Address</th>
       <th scope="col">State</th>
       <th scope="col">City</th>
       <th scope="col">..</th>
       <th scope="col">..</th>
       
       </tr>
 </thead> 
<tbody>
<%  
    for(Person person : new Dropdowns().getPersonList() ) {
%>    <tr>
      <td ><%=person.getId()%></td>
      <td><%=person.getName()%></td>
      <td><%=person.getLasName()%></td>
      <td><%=person.getEmail()%></td>
      <td><%=person.getAge()%></td>
      <td><%=person.getAddress()%></td>
      <td><%=person.getState()%></td>
      <td><%=person.getCity()%></td>
      <td><button class= "btn btn-btnoutline-primary btn-block" onclick="myFunctionupdate(<%=person.getId()%>)">Update</button></td>
      <td><button class= "btn btn-btnoutline-primary btn-block" onclick="myFunctiondelete(<%=person.getId()%>)">Delete</button></td>
      </Tr>
      <% } %>
      
</tbody>
 </table>
</div>

<div id="modal-update" title="Update User">

     <div class="form-group">
		  <label for="id-name">ID:</label>
		  <input type="text" name="id-name" class="form-control" id="id-name" disable=true>		  		   
		</div>

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
		  <label for="age">Age:</label>
		  <input type="text" name="age" class="form-control" id="age">		  		   
		</div>
		
		    <div class="form-group">
		  <label for="usr">Address:</label>
		  <input type="text" name="address" class="form-control" id="address">		  		   
		    </div>
		    
		    
		    
		  <div class="form-group">
		  <label for="state">State:</label>
		  <select id="state-select" name="state" class="form-control"> 
		  <% for (State state: new Dropdowns().getStateDrop()) { %>		  
		  <option value="<%=state.getId() %>"><%= state.getName() %></option>
		  <%}%>
		  
		  </select>
		  		  		   
		      </div>
		    
		    
		      <div class="form-group">
		  <label for="city">City:</label>
		   <select id="city-select" name="city" class="form-control"> 
		
		  
		  </select>	  		   
		      </div>
		    
		    
		     <div class="form-group">
		  <label for="password">Password:</label>
		  <input type="password" name="password" class="form-control" id="password">		  		   
		    </div>
		    
		    
		     <div class="form-group">
		  <label for="confirm-password">Confirm-Password:</label>
		  <input type="password" name="confirm-password" class="form-control" id="confirm-password">		  		   
		    </div>
		
		
		
		
		
		
		<button  class="btn btn-outline-primary" onclick="update()">UPDATE</button>
		
		</div>
</div>

</article>


	<footer><%@ include file="../template/footer.jsp"%>	</footer>

</body>
</html>