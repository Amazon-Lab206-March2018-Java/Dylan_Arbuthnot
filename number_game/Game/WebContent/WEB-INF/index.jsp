<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="static/style.css">
		<title>Great Number Game</title>
	</head>
	<body>
		<div id="wrapper">
			<h1>Welcome to the Great Number Game!</h1>
			<p>I am thinking of a number between 1 and 100...</p>
			<p>Take a guess and your fate will be decided.</p>
			<c:if test = "${guess == num}">
				<div class="won">
					<c:out value="${num}"/> was the number!<br>
					<form action="<c:url value="/" />" method="POST">
						<input type="hidden" name="replay" value="true">
						<input type="submit" value="Play Again">
					</form>
				</div>
			</c:if>
			<c:if test = "${guess < num }">
				<div class="lost">
					Too low!
				</div>
			</c:if>
			<c:if test = "${guess > num }">
				<div class="lost">
					Too high!
				</div>
			</c:if>
			<form action=<c:url value="/" /> method="POST">
				<input type="number" name="guess" placeholder="Input your guess here"><br>
				<input type="submit" value="Submit">
			</form>
		</div>
	</body>
</html>