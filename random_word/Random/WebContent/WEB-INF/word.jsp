<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Random Word Generator</title>	
	</head>
	<body>
		<h1>You have generated a random word <c:out value="${count}"/> times!</h1>
		<h3><c:out value="${word}"/></h3>
		<br>
		<form action="<c:url value="/" />" method="post">
			<input type="text" name="word" placeholder="Word">
			<input type="submit" value="Generate Word">
		</form>
		<p>Last word generated at: <c:out value="${timestamp}"/>
	</body>
</html>