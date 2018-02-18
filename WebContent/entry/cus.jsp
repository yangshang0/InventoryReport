<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/da.css">
</head>
<body>
	<form action="../DynamicEntry" method="post" >
	<div class="container" >
		<fieldset>
			<legend>Customer</legend>
		<div class="left" >
		<fieldset>
				<p><label class="field" for="Appointed Representative">Appointed Representative</label><input type="text" name="clsmm" value="" maxlength="6"></p>
				<p><label class="field" for="Region">Region</label><input type="text" name="clsr" value="" maxlength="6"></p>
				<p><label class="field" for="Service Rating">Service Rating</label><input type="text" name="clspa" value="" maxlength="6"></p>
				<p><label class="field" for="Advertisement Rating">Advertisement Rating</label><input type="text" name="clsdd" value="" maxlength="6"></p>
				<p><label class="field" for="Grade A">Grade A</label><input type="text" name="clsg1" value="" maxlength="6"></p>
				<p><label class="field" for="Grade B">Grade B</label><input type="text" name="clsg2" value="" maxlength="6"></p>
		</fieldset>
		</div>
		</fieldset>
		</div>
		<div class="container" >
			<button class="buttons" type="submit" value="cus" name="save">Save File</button>
			<input  class="buttons" type="reset" value="Reset" />
			<button class="buttons" type="button" onclick="location.href='../dynamicEntry.jsp'">Back to Entry Form</button>
		</div>
	</form>
</body>
</html>