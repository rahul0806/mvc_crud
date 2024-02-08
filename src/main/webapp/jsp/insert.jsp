<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Insert</legend>
<form action="insert" method="post">
	<table>
	    <tr>
	    	<td>Name<td>
	    	<td><input type="text" name="name"></td>
	    </tr>
	    <tr>
	    	<td>email<td>
	    	<td><input type="email" name="email"></td>
	    </tr>
	    <tr>
	    	<td>Designation<td>
	    	<td><input type="text" name="design"></td>
	    </tr>
	    <tr>
	    	<td>DOB<td>
	    	<td><input type="date" name="dob"></td>
	    </tr>
	    <tr>
	    	<td><button>ADD</button>
	    	<td><button type="reset">Cancel</button></td>
	    </tr>
	    <tr>
	    <td > <a href="/mvc_crud"><button type="button">Back</button></a></td>
	    </tr>
	</table>
 
</form>
</fieldset>


</body>
</html>