<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>

<%@ page import="java.util.Date" %>

<%
    String username = request.getParameter("name");
%>

<h1>Hey <%= username %></h1>
<h2>Current time: <%= new Date() %></h2>

</body>
</html>