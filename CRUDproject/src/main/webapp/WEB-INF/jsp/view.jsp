<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Teachers list</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Expertise</th><th>Update</th><th>Delete</th></tr>  
   <c:forEach var="teach" items="${list}">   
   <tr>  
   <td>${teach.id}</td>  
   <td>${teach.name}</td>  
   <td>${teach.expertise}</td>   
   <td><a href="Update/${teach.id}">Update</a></td>  
   <td><a href="delete/${teach.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="teachupdate">Add New Teacher</a>  
</body>
</html>