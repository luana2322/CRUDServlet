<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>UPDATE</h1>

<h3 style="color: red "> ${error}</h3>

<% if(request.getAttribute("data")!=null){
	Student student= (Student) request.getAttribute("data");
	
	
	
%>

<form action="update" method="post">

<input type="text" name="id" readonly value="<%= student.getId() %>">
<input type="text" name="name" value="<%= student.getName() %>">
<input type="text" name="pass" value="<%= student.getPass() %>">
<input type="text" name="address" value="<%= student.getAdress() %>">
<input type="text" name="age" value="<%= student.getAge() %>">

<button type="submit">Submit</button>


</form>
<% 
}
%>

</body>
</html>