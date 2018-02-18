<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/da.css">
</head>
<body>

<div id="top">
<div class="logout" >
<button class="buttons" type="button" onclick="location.href='mainFrame.jsp'">Back to Main </button>
<button class="buttons" type="button" onclick="location.href='Logout'">Logout</button>
</div>
<hr class="hor">
</div>

<div id="bottom">
<div class="dynamicEntry">
<form action="/Web/DynamicEntry" method="post">  

<h3>Dynamic Entry Form</h3><br><br>
<!-- As of 2017 6 of the 9 entries were merged into inv -->
<button class="da" type="button" onclick="location.href='entry/inv.jsp'" >INV </button>
<button class="da" type="button" onclick="location.href='entry/prod.jsp'" >PROD</button>
<button class="da" type="button" onclick="location.href='entry/cus.jsp'" >CUS</button>
<button class="da" type="button" onclick="location.href='entry/rp.jsp'" >RP</button>
</form>
</div>
</div>
</body>
</html>