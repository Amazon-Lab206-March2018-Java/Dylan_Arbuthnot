<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Counter!</title>
	</head>
	<body>
		<h1>You cheeky jokester, you!</h1>
		<p>You have visited this server <c:out value="${counter}"/> times.</p>
		<p><a href="/">Test another visit if you dare.</a></p>
		<p><a href="/two">If you are really bold, click me! I'm double!</a></p>
		<c:if test="${counter > 9}">
			<p>Do yourself and everybody else a favor, get a life!</p>
		</c:if>
		<form action="/reset" method="POST">
			<input type="submit" value="Reset count">
		</form>
	</body>
</html>