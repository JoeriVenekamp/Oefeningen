<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dit is Person.jsp</title>
</head>
<body>
tekst<br>

Naam is: <%= request.getAttribute("Naam") %> <br>
Leeftijd is: <%= request.getAttribute("Leeftijd") %>


</body>
</html>