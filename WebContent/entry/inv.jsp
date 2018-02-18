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
			<legend>Account</legend>
		<div class="left" >
			<fieldset>
				<legend>Non-Member Accounts</legend>
					<p><label class="field" for="Non Member Account">Non Member Account</label><input type="text" name="scardail" value="" maxlength="6"></p>
					<p><label class="field" for="Applied Code">Applied Code</label><input type="text" name="scardarsc" value="" maxlength="6"></p>
					<p><label class="field" for="Applied Code">Applied Code</label><input type="text" name="scardarsc2" value="" maxlength="6"></p>
					<p><label class="field" for="Applied Code">Applied Code</label><input type="text" name="scardarsc3" value="" maxlength="6"></p>
					<p><label class="field" for="Day Last Login">Day Last Login</label><input type="text" name="scardadpd" value="" maxlength="6"></p>
					<p><label class="field" for="Account Balance">Account Balance</label><input type="text" name="scardapb" value="" maxlength="6"></p>
			</fieldset>
			<fieldset>
					<legend>Legal Product</legend>
					<p><label class="field" for="Legal Age">Legal Age</label><input type="text" name="scdaop" value="" maxlength="6"></p>
					<p><label class="field" for="Placement">Placement</label><input type="text" name="scdaos" value="" maxlength="6"></p>
					<p><label class="field" for="Application Product Id">Application Product Id</label><input type="text" name="scdaoco" value="" maxlength="6"></p>
					<p><label class="field" for="Approved Listing">Approved Listing</label><input type="text" name="scdaog" value="" maxlength="6"></p>
					<p><label class="field" for="Rejected Listing">Rejected Listing</label><input type="text" name="scdcob" value="" maxlength="6"></p>
			</fieldset>
			</div>
			<div class="right" >
			<fieldset>
				<legend>Product Deduction List</legend>
					<p><label class="field" for="Product Id">Product Id</label><input type="text" name="scatldbil" value="" maxlength="6"></p>
					<p><label class="field" for="Product Code">Product Code</label><input type="text" name="scatldbrsc" value="" maxlength="6"></p>
					<p><label class="field" for="Product Code">Product Code</label><input type="text" name="scatldbrsc2" value="" maxlength="6"></p>
					<p><label class="field" for="Product Code">Product Code</label><input type="text" name="scatldbrsc3" value="" maxlength="6"></p>
					<p><label class="field" for="Coupon">Coupon</label><input type="text" name="scatldbpd" value="" maxlength="6"></p>
					<p><label class="field" for="Clearance">Clearance</label><input type="text" name="scatldbpb" value="" maxlength="6"></p>
			</fieldset>
			</div>
		</fieldset>
		<fieldset>
			<legend>Billing</legend>
		<div class="left" >
		<fieldset>
				<p><label class="field" for="Billing Code">Billing Code</label><input type="text" name="sbo" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs2" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs3" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs4" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs5" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs6" value="" maxlength="6"></p>
				<p><label class="field" for="Product Number">Product Number</label><input type="text" name="sbrs7" value="" maxlength="6"></p>
				<p><label class="field" for="Payment Type">Payment Type</label><input type="text" name="sbbg" value="" maxlength="6"></p>
				<p><label class="field" for="Receipt">Receipt</label><input type="text" name="sbac" value="" maxlength="6"></p>
				<p><label class="field" for="Total Payment">Total Payment</label><input type="text" name="sbdd" value="" maxlength="6"></p>
				<p><label class="field" for="Unpaid Total">Unpaid Total</label><input type="text" name="sbup" value="" maxlength="6"></p>
		</fieldset>
		</div>
		</fieldset>
		<fieldset>
		<legend>Refill Listing</legend>
		<div class="left" >
		<fieldset>
			<legend>Sector List</legend>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sbrsc" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sbrsc2" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sbrsc3" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sbrsc4" value="" maxlength="6"></p>
				<p><label class="field" for="Percent to fill">Percent to fill</label><input type="text" name="sbcob" value="" maxlength="6"></p>
				<p><label class="field" for="Filling Date">Filling Date</label><input type="text" name="sbciic" value="" maxlength="6"></p>
		</fieldset>	
		</div>
		<div class="right" >
		<fieldset>
			<legend>Online Product</legend>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sb2rsc" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sb2rsc2" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sb2rsc3" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="sb2rsc4" value="" maxlength="6"></p>
				<p><label class="field" for="Percent to fill">Percent to fill</label><input type="text" name="sb2cob" value="" maxlength="6"></p>
				<p><label class="field" for="Estimated Arrival">Estimated Arrival</label><input type="text" name="sb2d" value="" maxlength="6"></p>
				<p><label class="field" for="Filling Date">Filling Date</label><input type="text" name="sb2ciic" value="" maxlength="6"></p>
		</fieldset>
		</div>
		</fieldset>
		<fieldset>
		<legend>Business Product</legend>
		<div class="left" >
		<fieldset>
				<p><label class="field" for="Client">Client</label><input type="text" name="srbbo" value="" maxlength="6"></p>
				<p><label class="field" for="Order Status">Order Status</label><input type="text" name="srbbrs" value="" maxlength="6"></p>
				<p><label class="field" for="Pricing Grade">Pricing Grade</label><input type="text" name="srbbbg" value="" maxlength="6"></p>
				<p><label class="field" for="Advertise Code">Advertise Code</label><input type="text" name="srbbac" value="" maxlength="6"></p>
				<p><label class="field" for="Days Delayed">Days Delayed</label><input type="text" name="srbbdd" value="" maxlength="6"></p>
				<p><label class="field" for="Number of Orders">Number of Orders</label><input type="text" name="srbbolp" value="" maxlength="6"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="srbbola" value="" maxlength="6"></p>
				<p><label class="field" for="Payment Sum">Payment Sum</label><input type="text" name="srbbup" value="" maxlength="6"></p>
		</fieldset>
		</div>
		</fieldset>
				<fieldset>
		<legend>Sale Representative</legend>
		<div class="left" >
		<fieldset>
				<fieldset>
			<legend>First Class</legend>
				<p><label class="field" for="Days Delayed">Days Delayed</label><input type="text" name="ilcc1pd1dd" value="" maxlength="2"></p>
				<p><label class="field" for="Total Sales">Total Sales</label><input type="text" name="ilcc1pd1ocs" value="" maxlength="3"></p>
				<p><label class="field" for="Number of Customer">Number of Customer</label><input type="text" name="ilcc1pd1obs" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Second Class</legend>
				<p><label class="field" for="Days Delayed">Days Delayed</label><input type="text" name="ilcc1pd2dd" value="" maxlength="2"></p>
				<p><label class="field" for="Total Sales">Total Sales</label><input type="text" name="ilcc1pd2ocs" value="" maxlength="3"></p>
				<p><label class="field" for="Number of Customer">Number of Customer</label><input type="text" name="ilcc1pd2obs" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Representative Holding</legend>
				<p><label class="field" for="Representative Id">Representative Id</label><input type="text" name="ilcchrd1dd" value="" maxlength="2"></p>
				<p><label class="field" for="E Number">E Number</label><input type="text" name="ilcchrd1pc" value="" maxlength="2"></p>
				<p><label class="field" for="Department">Department</label><input type="text" name="ilcchrd1pc2" value="" maxlength="2"></p>
				<p><label class="field" for="Department B">Department B</label><input type="text" name="ilcchrd1pc3" value="" maxlength="2"></p>
				<p><label class="field" for="Department C">Department C</label><input type="text" name="ilcchrd1pc4" value="" maxlength="2"></p>
				<p><label class="field" for="Department D">Department D</label><input type="text" name="ilcchrd1pc5" value="" maxlength="2"></p>
				<p><label class="field" for="CC Code">CC Code</label><input type="text" name="ilcchrd1cc" value="" maxlength="2"></p>
				<p><label class="field" for="CC Code B">CC Code B</label><input type="text" name="ilcchrd1cc2" value="" maxlength="2"></p>
				<p><label class="field" for="CC Code C">CC Code C</label><input type="text" name="ilcchrd1cc3" value="" maxlength="2"></p>
				<p><label class="field" for="Extension">Extension</label><input type="text" name="ilcchrd1bs" value="" maxlength="3"></p>
		</fieldset>	
		<fieldset>
			<legend>Primary Assist</legend>
				<p><label class="field" for="Care Code">Care Code</label><input type="text" name="ilccmrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Care Status">Care Status</label><input type="text" name="ilccmrdd" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Sub Primary Assist</legend>
				<p><label class="field" for="Field Code">Field Code</label><input type="text" name="ilcclrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Product Id">Product Id</label><input type="text" name="ilcclrdubs" value="" maxlength="3"></p>
				<p><label class="field" for="Sub Rate">Sub Rate</label><input type="text" name="ilcclrdd" value="" maxlength="3"></p>
				<p><label class="field" for="Core Holding">Core Holding</label><input type="text" name="ilcclrdocs" value="" maxlength="3"></p>
				<p><label class="field" for="Sub Holding">Sub Holding</label><input type="text" name="ilcclrdobs" value="" maxlength="3"></p>
				<p><label class="field" for="Prime Holding">Prime Holding</label><input type="text" name="ilcclrdbs" value="" maxlength="3"></p>
		</fieldset>
		</fieldset>
		</div>
		<div class="right" >
		<fieldset>
		<fieldset>
			<legend>Order Summary</legend>
				<p><label class="field" for="Tracker Code">Tracker Code</label><input type="text" name="ilcchrd2dd" value="" maxlength="2"></p>
				<p><label class="field" for="Estimated Days">Estimated Days</label><input type="text" name="ilcchrd2t1dd" value="" maxlength="2"></p>
				<p><label class="field" for="Days Delayed">Days Delayed</label><input type="text" name="ilcchrd2t3dd" value="" maxlength="2"></p>
				<p><label class="field" for="Booking">Booking</label><input type="text" name="ilcchrd2t6dd" value="" maxlength="2"></p>
				<p><label class="field" for="Price">Price</label><input type="text" name="ilcchrd2ubs" value="" maxlength="3"></p>
				<p><label class="field" for="Product Id">Product Id</label><input type="text" name="ilcchrd2pc" value="" maxlength="2"></p>
				<p><label class="field" for="Product Id B">Product Id B</label><input type="text" name="ilcchrd2pc2" value="" maxlength="2"></p>
				<p><label class="field" for="Product Id C">Product Id C</label><input type="text" name="ilcchrd2pc3" value="" maxlength="2"></p>
				<p><label class="field" for="Product Id D">Product Id D</label><input type="text" name="ilcchrd2pc4" value="" maxlength="2"></p>
				<p><label class="field" for="Product Id E">Product Id E</label><input type="text" name="ilcchrd2pc5" value="" maxlength="2"></p>
				<p><label class="field" for="Promo Id">Promo Id</label><input type="text" name="ilcchrd2cc" value="" maxlength="2"></p>
				<p><label class="field" for="Promo Id B">Promo Id B</label><input type="text" name="ilcchrd2cc2" value="" maxlength="2"></p>
				<p><label class="field" for="Promo Id C">Promo Id C</label><input type="text" name="ilcchrd2cc3" value="" maxlength="2"></p>
				<p><label class="field" for="Listing">Listing</label><input type="text" name="ilcchrd2d" value="" maxlength="3"></p>
				<p><label class="field" for="Sector">Sector</label><input type="text" name="ilcchrd2ocs" value="" maxlength="3"></p>
				<p><label class="field" for="Bar Id">Bar Id</label><input type="text" name="ilcchrd2obs" value="" maxlength="3"></p>
				<p><label class="field" for="Online Product">Online Product</label><input type="text" name="ilcchrd2bs" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
		<legend>Closed Accounts</legend>
				<p><label class="field" for="Closed Account">Closed Account</label><input type="text" name="ilccdadd" value="" maxlength="2"></p>
		</fieldset>
		<fieldset>
			<legend>Inactive Accounts</legend>
			<p><label class="field" for="Account Balance">Account Balance</label><input type="text" name="ilcczbaprb" value="" maxlength="6"></p>
				<p><label class="field" for="Last purchase Id">Last purchase Id</label><input type="text" name="ilcczbapb" value="" maxlength="6"></p>
				<p><label class="field" for="Last Activity Date">Last Activity Date</label><input type="text" name="ilcczbalado" value="" maxlength="8"></p>
		</fieldset>
		</fieldset>
		</div>
		</fieldset>
		<fieldset>
			<legend>Payment Option</legend>
		<div class="left" >
		<fieldset>
			<legend>Credit Card</legend>
				<p><label class="field" for="Valid Card">Valid Card</label><input type="text" name="hecc1pdaifpd" value="" maxlength="1"></p>
				<p><label class="field" for="Purchase Id">Purchase Id</label><input type="text" name="hecc1pddd" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="hecc1pdspc" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code B">Product Code B</label><input type="text" name="hecc1pdspc2" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code C">Product Code C</label><input type="text" name="hecc1pdspc3" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code D">Product Code D</label><input type="text" name="hecc1pdspc4" value="" maxlength="2"></p>
				<p><label class="field" for="Purchase Amount">Purchase Amount</label><input type="text" name="hecc1pdltv" value="" maxlength="3"></p>
				<p><label class="field" for="Note">Note</label><input type="text" name="hecc1pdbs" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Debit Card</legend>
				<p><label class="field" for="Valid Card">Valid Card</label><input type="text" name="hecchrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Purchase Id">Purchase Id</label><input type="text" name="hecchrdt6dd" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code">Product Code</label><input type="text" name="hecchrdspc" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code B">Product Code B</label><input type="text" name="hecchrdspc2" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code C">Product Code C</label><input type="text" name="hecchrdspc3" value="" maxlength="2"></p>
				<p><label class="field" for="Product Code D">Product Code D</label><input type="text" name="hecchrdspc4" value="" maxlength="2"></p>
				<p><label class="field" for="Purchase Amount">Purchase Amount</label><input type="text" name="hecchrdltv" value="" maxlength="3"></p>
				<p><label class="field" for="Note">Note</label><input type="text" name="hecchrdt3dd" value="" maxlength="2"></p>
				<p><label class="field" for="Deduction">Deduction</label><input type="text" name="hecchrdbs" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Direct Pay</legend>
				<p><label class="field" for="Valid Account">Valid Account</label><input type="text" name="heccoaaio" value="" maxlength="1"></p>
				<p><label class="field" for="Purchase Id">Purchase Id</label><input type="text" name="heccoaola" value="" maxlength="3"></p>
				<p><label class="field" for="Purchase Amount">Purchase Amount</label><input type="text" name="heccolpoa" value="" maxlength="3"></p>
		</fieldset>
		</div>
		<div class="right" >
		<fieldset>
			<legend>Tracking Status</legend>
				<p><label class="field" for="Days Delayed">Days Delayed</label><input type="text" name="hecc1pd2dd" value="" maxlength="2"></p>
				<p><label class="field" for="On Track">On Track</label><input type="text" name="hecc1pd2aifpd" value="" maxlength="1"></p>
				<p><label class="field" for="Account Id">Account Id</label><input type="text" name="hecc1pd2ltv" value="" maxlength="3"></p>
		</fieldset>
		<fieldset>
			<legend>Shipping Info</legend>
				<p><label class="field" for="Customer Name">Customer Name</label><input type="text" name="heccmrddd" value="" maxlength="2"></p>
				<p><label class="field" for="Customer Address">Customer Address</label><input type="text" name="heccmrdspc" value="" maxlength="2"></p>
				<p><label class="field" for="Customer Phone">Customer Phone</label><input type="text" name="heccmrdspc2" value="" maxlength="2"></p>
				<p><label class="field" for="Origination">Origination</label><input type="text" name="heccmrdspc3" value="" maxlength="2"></p>
				<p><label class="field" for="Destination">Destination</label><input type="text" name="heccmrdspc4" value="" maxlength="2"></p>
				<p><label class="field" for="Shipping Rate">Shipping Rate</label><input type="text" name="heccmrdltv" value="" maxlength="3"></p>
				<p><label class="field" for="Additional Charge">Additional Charge</label><input type="text" name="heccmrdt3dd" value="" maxlength="2"></p>
				<p><label class="field" for="International Rate">International Rate</label><input type="text" name="heccmrdbs" value="" maxlength="3"></p>
		</fieldset>	
		<fieldset>
			<legend>Temporary Account</legend>
				<p><label class="field" for="Account Id">Account Id</label><input type="text" name="heccdadd" value="" maxlength="2"></p>
		</fieldset>
		</div>
		</fieldset>
	</div>
		<div class="container" >
			<button class="buttons" type="submit" value="inv" name="save">Save File</button>
			<input  class="buttons" type="reset" value="Reset" />
			<button class="buttons" type="button" onclick="location.href='../dynamicEntry.jsp'">Back to Entry Form</button>
		</div>
	</form>
</body>
</html>