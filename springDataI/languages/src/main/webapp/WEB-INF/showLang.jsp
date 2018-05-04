<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title><c:out value="${lang.getName()}"/></title>
	</head>
	<body>
		<div class="row">
		<div class="col-4"></div>
			<div class="col-4 white">
			<a href="/languages" class="right-link">Dashboard</a>
				<p><span class="label">Name: </span><c:out value="${lang.getName()}"/></p>
				<p><span class="label">Creator: </span><c:out value="${lang.getCreator()}"/></p>
				<p><span class="label">Current Version: </span><c:out value="${lang.getCurrentVersion()}"/></p>
				<p><a href="/languages/delete/<c:out value="${id}"/>">Delete</a>&nbsp;|&nbsp;<a href="/languages/edit/<c:out value="${id}"/>">Edit</a></p>
			</div>
			<div class="col-4"></div>
		</div>	
	</body>
</html>