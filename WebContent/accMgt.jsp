<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<link rel="stylesheet" type="text/css" href="css/da.css">
<link rel="stylesheet" type="text/css" href="css/loginform.css">
</head>
<body>
<div id="top">
<div class="logout" >
<button class="buttons" type="button" onclick="location.href='access.jsp'" >Account Access (Admin only)</button>
<button class="buttons" type="button" onclick="location.href='mainFrame.jsp'">Back to Main Page</button>
</div></div>

<div id="bottom">
<div class="login-page">
<form action="/Web/Reset" method="post">  
New Password:<input type="password" name="pass" value="" placeholder="Password" ><br>  
<button class="confirm" type="submit" value="reset">Change Password</button>
</form>
</div>
</div>
</html>