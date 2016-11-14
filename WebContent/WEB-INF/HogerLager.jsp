<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HogerLager.jsp</title>
</head>
<body>
	
	<h1>Hoger of Lager!</h1>
	
	Hallo <%= request.getAttribute("userName") %><br>
	
	Raad het getal <form method="post" action="" >
	<input type = "text" name = "guess">
	<input type = "submit"><br>
	</form>
	
<%-- 	<% if (request.getAttribute("output") != null){ %> --%>
<%-- 		<%= request.getAttribute("output") %> --%>
<%-- 	<% } %> --%>
<!-- 	<br> -->
<%-- 	<% if (request.getAttribute("countOutput") != null){ %> --%>
<%-- 		<%= request.getAttribute("countOutput") %> --%>
<%-- 	<% } %> --%>
	
	
</body>
</html>