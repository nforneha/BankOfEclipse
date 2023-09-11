<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Welcome to BankOfEclipse</title>
  
</head>
 
</head>
  <body bgcolor="steelblue">
  <div style="text-align:center;background-color:rgba(40,40,250,0.3);border-color:white;" >
		<h1 style="color:white;">
		Welcome to MyBank	
		</h1>
  </div>
  	<br/><br/>  
	<div style="text-align:center;background-color:rgba(10,10,250,0.3);border-color:white; color:white;font-size:22px;">
    <form action="login" method="post">
	<br/><br/>
   UserName:<input type="text" name="userName" id="userName"/>
     <br/><br/>
   Password:<input type="password" name="password" id="password"/>
   
   
    <br/><br/>
    <input type="submit" value="login"/>  
    </form>  
    </div>
  </body>
</html>
