<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<table border="4">

	<tr>
	   <td>ID</td>
	   <td>Name</td>
	   <td>Email</td>
	   <td>designation</td>
	   <td>Age</td>
	   <td>Dob</td>
	   <td>Edit</td>
	   <td>Delete</td>
	 </tr>
	 <c:forEach var="emp" items="${list}">
	 <tr>
	   <td>${emp.getId()}</td>
	   <td>${emp.getName()}</td>
	   <td>${emp.getEmail()}</td>
	   <td>${emp.getDesign()}</td>
	   <td>${emp.getAge()}</td>
	   <td>${emp.getDob()}</td>
	   <td><button>Edit</button></td>
	   <td><a href="delete?id=${emp.getId()}"><button>Delete</button></a></td>
	   
	     
	 </tr>
	 </c:forEach>
	 
	 
	 
</table>
<a href="/mvc_crud"><button>Back</button></a>
</div>

</body>
</html>