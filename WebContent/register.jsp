<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head> 
<link rel="stylesheet" type="text/css" href="css/loginform.css">
</head>
<body>

<div class="register-page" >
<form action="/Web/Register" method="post">  
New Username:<input type="text" name="username" value="" placeholder="New Username" ><br>  
New Password:<input type="password" name="pass" value="" placeholder="New Password" ><br>  
Email:<input type="text" name="email" value="" placeholder="Email" ><br>  
<button class="confirm" type="submit" value="register">Register</button>
</form>  
</div>
</body>  
</html>  