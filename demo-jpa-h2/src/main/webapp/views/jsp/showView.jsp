<%@page import="com.learning.demojpah2.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@page isELIgnored="false" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="header_new.jsp"/>
<title>Insert title here</title>
</head>
<body>
	
	<br><br><br>
	<div align="center">
	<form action="/" >
		<input type="submit" value="home"><br>
	</form>
	</div>
	<br><br><br>
	${students}
	<br><br><br>
	<div align="center">
	<table border="1px" draggable="true" >
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>MOBILE</th>
			<th>ADDRESS</th>
		</tr>
		
		<c:forEach items="${students}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.name }</td>
			<td>${student.mobile}</td>
			<td>${student.address}</td>
		</tr>
		</c:forEach>
	
	</table>
</body>
</html>