<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

  <br/>
  <br/>
  <br/>
  <br/>
    <center>
   		<h3> Login Form</h3>
 		<form action = "LoginServlet" method="get">
 		Enter username : <input type = "text" name= "uname"><br>
 		Enter password : <input type = "password" name = "pass"><br>
 		<input type = "submit" value = "login">
 	</center>
 	<a href="signup.jsp">Not registered? Sign up now!</a>
 </form>
</body>
</html>