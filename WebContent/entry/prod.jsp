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
			<legend>Product</legend>
		<div class="left" >
		<fieldset>
				<p><label class="field" for="Service Fee">Service Fee</label><input type="text" name="afssu" value="" maxlength="6"></p>
				<p><label class="field" for="Product Id">Product Id</label><input type="text" name="afssu2" value="" maxlength="6"></p>
				<p><label class="field" for="Price">Price</label><input type="text" name="afspa" value="" maxlength="6"></p>
				<p><label class="field" for="Availability">Availability</label><input type="text" name="afsco" value="" maxlength="6"></p>
				<p><label class="field" for="Quantity">Quantity</label><input type="text" name="afsco2" value="" maxlength="6"></p>
				<p><label class="field" for="User Rating">User Rating</label><input type="text" name="afsco3" value="" maxlength="6"></p>
				<p><label class="field" for="Online Product">Online Product</label><input type="text" name="afspg" value="" maxlength="6"></p>
				<p><label class="field" for="Online Product B">Online Product B</label><input type="text" name="afspg2" value="" maxlength="6"></p>
				<p><label class="field" for="Advertisement Placement">Advertisement Placement</label><input type="text" name="afssc" value="" maxlength="6"></p>
				<p><label class="field" for="Shipping Availability">Availability</label><input type="text" name="afsdd" value="" maxlength="6"></p>
				<p><label class="field" for="Notes">Notes</label><input type="text" name="afsdiv" value="" maxlength="6"></p>
				<p><label class="field" for="Notes B">Notes B</label><input type="text" name="afsdiv2" value="" maxlength="6"></p>
				<p><label class="field" for="Notes C">Notes C</label><input type="text" name="afsdiv3" value="" maxlength="6"></p>
				<p><label class="field" for="Notes D">Notes D</label><input type="text" name="afsdiv4" value="" maxlength="6"></p>
				<p><label class="field" for="Notes E">Notes E</label><input type="text" name="afsdiv5" value="" maxlength="6"></p>
				<p><label class="field" for="Notes F">Notes F</label><input type="text" name="afsdiv6" value="" maxlength="6"></p>
				<p><label class="field" for="Notes G">Notes G</label><input type="text" name="afsdiv7" value="" maxlength="6"></p>
				<p><label class="field" for="Notes H">Notes H</label><input type="text" name="afsdiv8" value="" maxlength="6"></p>
				<p><label class="field" for="Notes I">Notes I</label><input type="text" name="afsdiv9" value="" maxlength="6"></p>
				<p><label class="field" for="Notes J">Notes J</label><input type="text" name="afsdiv10" value="" maxlength="6"></p>
				<p><label class="field" for="Notes K">Notes K</label><input type="text" name="afsdiv11" value="" maxlength="6"></p>
				<p><label class="field" for="Product Label">Product Label</label><input type="text" name="afsdiv12" value="" maxlength="6"></p>
				<p><label class="field" for="Product Label B">Product Label B</label><input type="text" name="afsdiv13" value="" maxlength="6"></p>
				<p><label class="field" for="Bar Code">Bar Code</label><input type="text" name="afsdiv14" value="" maxlength="6"></p>
				<p><label class="field" for="Coupon Code">v</label><input type="text" name="afsdiv15" value="" maxlength="6"></p>
				<p><label class="field" for="Product Name">Product Name</label><input type="text" name="afsdiv16" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="afsdiv17" value="" maxlength="6"></p>
				<p><label class="field" for="Category">Category</label><input type="text" name="afsdiv18" value="" maxlength="6"></p>
		</fieldset>
		</div>
	</fieldset>
	</div>
		<div class="container" >
			<button class="buttons" type="submit" value="prod" name="save">Save File</button>
			<input  class="buttons" type="reset" value="Reset" />
			<button class="buttons" type="button" onclick="location.href='../dynamicEntry.jsp'">Back to Entry Form</button>
		</div>
	</form>
</body>
</html>