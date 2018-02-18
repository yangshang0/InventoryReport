<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/da.css">
<script type="text/javascript">
 function selectall()
 {
  var checkboxes = document.getElementsByName('access');
  for(var i=0, n=checkboxes.length;i<n;i++) {
    checkboxes[i].checked = true;
  }
 }
 function deselectall()
{
     var checkboxes = document.getElementsByName('access'), val = null;    
     for (var i = 0; i < checkboxes.length; i++)
     {
         if (checkboxes[i].type == 'checkbox')
         {
             checkboxes[i].checked = val;
         }
     }
 }
</script>
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

<form action="/Web/Access" method="post">
	<input type="submit" name="getTable" value="Refresh Account" />
	<table>
		${table}
	</table>
</form>
</div>
</body>
</html>