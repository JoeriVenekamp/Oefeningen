<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Title</title>
</head>
<body>
Dit is de body<br>


Kwadraten van 1 tot 100:
<ul>
 <% for(int i=1; i<=100; i++){ %>
 	<li> <%= i*i %></li>
 	<%} %>
</ul>

tien plus tien <%= 10 + 10 %>

</body>
</html>