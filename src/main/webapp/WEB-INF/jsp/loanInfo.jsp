
<!DOCTYPE html>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BankOfEclipse</title>
</head>
<body bgcolor="steelblue">
<div  style="background-color:rgba(10,10,250,0.2);border-color:white;font-size:22px;border-color:white;">
<center><h2 style="color:white;">Customer Information</h2></center>
<br><br><br>
<center><table cellspacing="3" cellpadding="3" style="border: 1px solid white;background-color:rgba(210,210,250,0.7);">
	<tr >
		<th style="border: 1px solid white;">Customer PAN :</th>
		<td style="border: 1px solid white;"><core:out value="${customer.panNumber}" /></td>
	</tr>
	<tr >
		<th style="border: 1px solid white;">Customer Name :</th>
		<td style="border: 1px solid white;"><core:out value="${customer.custName}" /></td>
	</tr>
	<tr>
		<th style="border: 1px solid white;">Customer CIBIL Score :</th>
		<td style="border: 1px solid white;"><core:out value="${customer.cibilScore}" /></td>
	</tr>
</table></center>
<br><br><br>
 <center><form action="emi" method="post" >
    <label>Loan Amount</label>
    <input type="text" name="loanAmount" id="loanAmount" /><br><br>
    <label>Loan Period in Months</label>
    <input type="text" name="time" id="time" /><br><br>
    <label>Rate of interest</label>
    <input type="text" name="rate" id="rate" /><br><br>
    <input type="submit" value="Get monthly EMI"/>   
    <br><br><br>
  </form>
  </center>
  <h1 style="color:white;text-align:center;">${message}</h1>
</div><br><br><br><br><br><br>
 <center><form action="logout" >
    <input type="submit" value="Logout"/></form>
    </center>
</body>
</html>