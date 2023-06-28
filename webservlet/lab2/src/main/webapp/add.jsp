<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ADD STUDENT</h1>
<h3 style="color: red">${error}</h3>

<form action="add">
<div style="display:flex;justify-content: center;text-align: center;"> <input type="text" name="id" placeholder="ID"></div>
<div style="display:flex;justify-content: center;text-align: center;"> <input type="text" name="name" placeholder="Name"></div>
<div style="display:flex;justify-content: center;text-align: center;"> <input type="text" name="pass" placeholder="Pass"></div>
<div style="display:flex;justify-content: center;text-align: center;"> <input type="text" name="address" placeholder="Address"></div>
<div style="display:flex;justify-content: center;text-align: center;"> <input type="text" name="age" placeholder="Age"></div>
<div style="display:flex;justify-content: center;text-align: center;"> <button type="submit">Submit</button> </div>


</form>

</body>
</html>