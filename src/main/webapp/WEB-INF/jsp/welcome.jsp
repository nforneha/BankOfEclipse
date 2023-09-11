<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Bank OF Eclipse</title>
  </head>
  <body bgcolor="steelblue">
    <h1 style="color:white;text-align:center;">${message}</h1>
    <br><br><br>
    <div style="text-align:center;background-color:rgba(10,10,250,0.1);border-color:white; color:white;font-size:22px;border-color:white;">
    <form action="panValidate" method="post">  
    <br><br><br>
   <label>Enter PAN Number for Validating</label>
    <input type="text" name="panNumber" id="panNumber" />
    <input type="submit" value="Validate"/>  
    </form>
    <br><br><br>
    <form action="adhaarValidate" method="post">  
	<label>Enter Adhaar Number for Validating</label>
    <input type="text" name="adhaar" id="adhaar" />
     <input type="submit" value="Validate"/>
    </form>
    <br><br><br>
    <form action="loan" >
    <label>Customer ID</label>
    <input type="text" name="panNumber" id="panNumber" />
    <input type="submit" value="Customer Information"/>   
    <br><br><br>
    </form>
    </div><br><br><br><br><br><br>
 <center><form action="logout" >
    <input type="submit" value="Logout"/></form>
    </center>
  </body>
</html>
