<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addStudent">
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>
		<input type="submit" name="submit"><br>	
	</form>
	<br>
	${message}
	<br><br>
	<form action="fetchAllStudents">
		
		<input type="submit" value="fetchAllStudents"><br>	
	</form>
	<br>
	<br><br>
	<form action="fetchStudent">
		<input type="text" name="id"><br>
		<input type="submit" value="fetchStudent"><br>	
	</form>
	<br>
</body>
</html>