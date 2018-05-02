<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Player</title>
	</head>
	<body>
		<h3>Create a New Player</h3>
		<form action="Players" method="POST">
			<label for="first_name">First Name: </label><input type="text" name="first_name" placeholder="Player first name here"><br>
			<label for="last_name">Last Name: </label><input type="text" name="last_name" placeholder="Play last name here"><br>
			<label for="age">Age: </label><input type="number" name="age" placeholder="Player name here"><br>
			<input type="submit" value="Create Player">
		</form>
	</body>
</html>