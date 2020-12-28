<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sessions</title>
<style>
div {
	text-align: center;
}
</style>
</head>
<body>
	<%
		if (request.getParameter("error") != null)
		out.println("<b>Your session has expired or is invalid.Please try again.</b><br>");
	%>
	<div style= "margin-top: 25px">
		<a href="registration.html"><h1>Register</h1></a><br>
		<a href="login.jsp"><h1>Login</h1></a>
	</div>
</body>
</html>
