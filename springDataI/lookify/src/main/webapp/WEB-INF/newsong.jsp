<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Lookify | New Song</title>
	</head>
	<body>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white">
			<a href="/dashboard" class="left">Dashboard</a>
				<form action="/search">
					<input type="submit" value="Search" class="right">
					<input type="text" placeholder="Search artists" name="artist" class="right">
				</form>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white">
				<h1 class="center-text">Create a New Song</h1>
				<form:form method="POST" action="/songs/new" modelAttribute="song">
				    <form:label path="name">Name
				    <span class="error"><form:errors path="name"/></span>
				    <form:input path="name" class="full"/></form:label>
				    
				    <form:label path="artist">Artist
				    <span class="error"><form:errors path="artist"/></span>
				    <form:input path="artist" class="full"/></form:label>
				    
				    <form:label path="rating">Rating
				    <span class="error"><form:errors path="rating"/></span>
				    <form:input path="rating" class="full" type="number"/></form:label>
				    
				    <input type="submit" value="Submit" class="submit"/>
				</form:form>
			</div>
			<div class="col-2"></div>
		</div>
	</body>
</html>