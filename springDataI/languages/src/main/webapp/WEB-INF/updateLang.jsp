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
			<a href="/languages/delete/<c:out value="${id}"/>" class="right-link">Delete</a><span class="right-link">&nbsp;|&nbsp;</span><a href="/languages" class="right-link">Dashboard</a>
				<form:form action="#" method="POST" modelAttribute="language">
					<p><form:label path="name">Name
					<span class="error"><form:errors path="name"/></span>
					<form:input path="name" class="full" value="${lang.getName()}"/></form:label></p>
					
					<p><form:label path="creator">Creator
					<span class="error"><form:errors path="creator"/></span>
					<form:input path="creator" class="full" value="${lang.getCreator()}"/></form:label></p>
					
					<p><form:label path="currentVersion">Current Version
					<span class="error"><form:errors path="currentVersion"/></span>
					<form:input path="currentVersion" class="full" value="${lang.getCurrentVersion()}"/></form:label></p>
					
					<input type="submit" value="Update Language" class="submit">
				</form:form>
			</div>
			<div class="col-4"></div>
		</div>	
	</body>
</html>