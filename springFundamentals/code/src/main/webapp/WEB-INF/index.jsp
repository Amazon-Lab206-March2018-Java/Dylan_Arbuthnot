<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/materialize.css">
		<script type="text/javascript" src="/js/materialize.js"></script>
		<title>The Code</title>
	</head>
	<body>
		<div class="container">
			<div class="col s12 center-align">
				<p><span class="red-text text-darken-2"><c:out value="${error}"/></span></p>
				<p>What is the code?</p>
				<form action="/" method="POST">
					<input type="text" name="code">
					<br>
					<input type="submit" value="Enter the Code">
				</form>
			</div>
		</div>
	</body>
</html>