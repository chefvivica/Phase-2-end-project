<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login success</title>
</head>
<body>
	<h1>Welcome <%=request.getParameter("username")%></h1><br>
	
		<%
			Date createTime = new Date(session.getCreationTime());
			Date lastAccessTime = new Date(session.getLastAccessedTime());				
		%>
		<p>Session Creation Time: <% out.print(createTime); %></p>
		<p>Time of Last Access: <% out.print(lastAccessTime); %></p><br>
		
		<a href="logout.jsp"> Log out</a>
</body>
</html>