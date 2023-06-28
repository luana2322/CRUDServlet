<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.List" %>
	<%@ page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

a {
	display: inline-block;
	padding: 0.5em 1em;
	background-color: #008CBA;
	color: #fff;
	text-align: center;
	text-decoration: none;
	font-size: 1em;
	border-radius: 4px;
	border: none;
	cursor: pointer;
}

a:hover {
	background-color: #0077B5;
}
</style>

</head>
<body>



<h1>STUDENT INFORMATION</h1>
<a href="add.jsp">ADD STUDENT</a>
	<table>

		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Pass</td>
			<td>Address</td>
			<td>Age</td>
			<td>Action</td>
		</tr>

		<%
		if (request.getAttribute("data") != null) {
			List<Student> list= (List<Student>) request.getAttribute("data");
			for(Student i:list){
				
		%>
		
      
	     <tr>
			<td><%= i.getId() %></td>
			<td><%= i.getName() %></td>
			<td><%= i.getPass()%></td>
			<td><%= i.getAdress()%></td>
			<td><%= i.getAge()%></td>
			<td>
			
			<a href="" onclick="delete1('<%= i.getId() %>')" >DELETE</a>
			<a href="update?id=<%= i.getId() %> " onclick="update1('<%= i.getId() %>')" >UPDATE</a>
			
			</td>
		</tr>






		<%
				}
		}
		%>

	</table>
	
	<script type="text/javascript">
	
	function delete1(id){
		if(confirm("Delete"+ id +" ?")){
			window.location="delete?id="+id;
		}
		
	}
	
	function update1(id){
		
		window.location="update?id="+id;
		
	}
	
	
	
	</script>
</body>
</html>