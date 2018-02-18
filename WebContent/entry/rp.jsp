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
		<legend>Report Summary</legend>
		<div class="left" >
		<fieldset>
				<p><label class="field" for="Business Accounts">Business Accounts</label><input type="text" name="tsysbba" value="" maxlength="6"></p>
				<p><label class="field" for="Primary Holder">Primary Holder</label><input type="text" name="tsysdd" value="" maxlength="6"></p>
				<p><label class="field" for="Secondary Holder">Secondary Holder</label><input type="text" name="tsysolp" value="" maxlength="6"></p>
				<p><label class="field" for="Lease Date">Lease Date</label><input type="text" name="tsysola" value="" maxlength="6"></p>
		</fieldset>
		</div>
		</fieldset>
		<fieldset>
			<legend>Individual Account</legend>
		<div class="left" >
		<fieldset>
			<legend>Prime Account</legend>
			<p><label class="field" for="Valid Account">Valid Account</label><input type="text" name="oacifpd" value="" maxlength="1"></p>
				<p><label class="field" for="Start Date">Start Date</label><input type="text" name="oacolp" value="" maxlength="3"></p>
				<p><label class="field" for="End Date">End Date</label><input type="text" name="oacola" value="" maxlength="4"></p>
		</fieldset>
		<fieldset>
			<legend>Member Account</legend>
				<p><label class="field" for="Valid Account">Valid Account</label><input type="text" name="hrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Start Date">Start Date</label><input type="text" name="hrdt30dd" value="" maxlength="2"></p>
				<p><label class="field" for="End Date">End Date</label><input type="text" name="hrdt60dd" value="" maxlength="2"></p>
				<p><label class="field" for="Renew Date">Renew Date</label><input type="text" name="hrdt90dd" value="" maxlength="2"></p>
				<p><label class="field" for="Account Discount">Account Discount</label><input type="text" name="hrdubs" value="" maxlength="3"></p>
				<p><label class="field" for="Product Rate">Product Rate</label><input type="text" name="hrdbs" value="" maxlength="3"></p>
				<p><label class="field" for="Upgrade ID">Upgrade ID</label><input type="text" name="hrdtsi" value="" maxlength="6"></p>
				<p><label class="field" for="Max Holding">Max Holding</label><input type="text" name="hrdts" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Non Member Account</legend>
				<p><label class="field" for="Regular Account">Regular Account</label><input type="text" name="lrddd" value="" maxlength="2"></p>
		</fieldset>
		</div>
		<div class="right" >
		<fieldset>
			<legend>Price Placement</legend>
			<p><label class="field" for="Valid Price">Valid Price</label><input type="text" name="o1difpd" value="" maxlength="1"></p>
				<p><label class="field" for="Min Price">Min Price</label><input type="text" name="o1dolp" value="" maxlength="3"></p>
				<p><label class="field" for="Max Price">Max Price</label><input type="text" name="o1dola" value="" maxlength="4"></p>
		</fieldset>	
		<fieldset>
			<legend>Annual Holding</legend>
			<p><label class="field" for="Valid Holding">Valid Holding</label><input type="text" name="fpdifpd" value="" maxlength="1"></p>
				<p><label class="field" for="Tax Rate">Tax Rate</label><input type="text" name="fpddd" value="" maxlength="2"></p>
		</fieldset>
		<fieldset>
			<legend>Fee and Charge</legend>
				<p><label class="field" for="Fee rate">Fee Rate</label><input type="text" name="mrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Discount Max">Discount Max</label><input type="text" name="mrdubs" value="" maxlength="3"></p>
				<p><label class="field" for="Discount Percent">Discount Percent</label><input type="text" name="mrdbs" value="" maxlength="3"></p>
		</fieldset>
		</div>
		</fieldset>
		</div>
		<div class="container" >
			<button class="buttons" type="submit" value="rp" name="save">Save File</button>
			<input  class="buttons" type="reset" value="Reset" />
			<button class="buttons" type="button" onclick="location.href='../dynamicEntry.jsp'">Back to Entry Form</button>
		</div>
	</form>
</body>
</html>