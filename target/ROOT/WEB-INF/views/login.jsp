<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JHazelnut Login</title>
</head>
<body>

	<form method="POST" action="/login">
	  User Name<br>
	  <input type="text" name="user" id="user"><br>
	  Pass<br>
	  <input type="text" name="pass" id="pass">
	  
	  <input type="submit" value="Submit">
	</form>
	
	<div>${msg}</div>

</body>
</html>