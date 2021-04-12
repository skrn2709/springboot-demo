<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css"	>
<!-- 	href="${pageContext.request.contextPath}/webapp/views/css/style.css"  !-->	
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
<title>Demo Project</title>
</head>
<body>
	<div class="dropdown">
		<nav>
			<a href="#" class="title">DemoApp</a>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">Tutorials <i class="fas fa-caret-down"></i></a>
					<ul>
						<li><a href="#">Python</a></li>
						<li><a href="#">Javascript</a></li>
						<li><a href="#">Java</a></li>
					</ul>
				</li>
				<li><a href="#">Web Design <i class="fas fa-caret-down"></i></a>
					<ul>
						<li><a href="#">Front End</a></li>
						<li><a href="#">Back End</a></li>
						<li><a href="#">Others <i 
						style="transform:rotate(-90deg);"
						class="fas fa-caret-down"></i></a>
							<ul>
								<li><a href="#">Links</a></li>
								<li><a href="#">Works</a></li>
								<li><a href="#">Stats</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li><a href="#">Contact</a></li>
				<li><a href="#">Feedback</a></li>
				<li><a href="#"><i class="fas fa-user-circle"></i></a></li>
					
			</ul>
		</nav>
	</div>
	<form action="addStudent" method="post">
	
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