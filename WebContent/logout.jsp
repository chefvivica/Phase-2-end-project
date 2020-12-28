<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Logout</title>
<style>
h3 {
	text-align: center;
	color:red;
}

</style>
</head>
<body>
	<%
		session.invalidate();
	%>
	<h3>You logged out successfully.</h3>
	<br>
	<div style="text-align:center">
	<a href="login.jsp">Login again</a>
	</div>
</body>
</html>
