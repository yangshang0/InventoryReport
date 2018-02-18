<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/main.css">
<link rel="stylesheet" type="text/css" href="css/da.css">
</head>
<body>
	<div class="main" >
	<button class="da" type="button" onclick="location.href='accMgt.jsp'">Account Management </button>
	<button class="da" type="button" onclick="location.href='Logout'">Logout</button>
	<hr class="hor" />
	<h3> Welcome ${username} </h3> 
	</div>
	
	<div class="menu" >
	<form action="/Web/Main" method="post">
    <button class="confirm" type="button" onclick="location.href='dynamicEntry.jsp'">Report Entry Form</button>

	</form>
	</div>
	
</body>
</html>