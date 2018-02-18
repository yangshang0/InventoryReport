<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/loginform.css">
</head>
<body>
<div class="error-page" >
 
<form action="/Web/Login" method="post">  
<H3>Login authentication failure</H3>
<Strong>Please try log in again: </Strong><br><br>
Username:<input type="text" name="username" value="" placeholder="User Name" ><br>  
Password:<input type="password" name="pass" value="" placeholder="Password" ><br>  
<button class="confirm" type="submit" value="login">Login</button>
<p style="color: red;">${errorString}</p>

<strong> Dont have account? Try </strong>  
<button class="confirm" type="button" onclick="location.href='register.jsp'" >Register</button>
</form>
</div>
</body>
</html>