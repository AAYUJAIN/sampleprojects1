<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %> --%>
<form action = "movietheatre" method = "post">

   Select your Choice <select name="choice">
    <option value="movie">Movie</option>
    <option value="theatre">Theatre</option>
    </select>
<input type="submit" value="Submit">
</form> 
</body>
</html>  