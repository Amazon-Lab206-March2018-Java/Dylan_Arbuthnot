<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Languages</title>
	</head>
	<body>
		<div class="row">
		<div class="col-4"></div>
			<div class="col-4 white">
				<table>
					<thead>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>Action</th>
					</thead>
					<tbody>
						<c:forEach var="lang" items="${languages}">
						<tr>
							<td><a href="/languages/<c:out value="${languages.indexOf(lang)}"/>"><c:out value="${lang.getName()}"/></a></td>
							<td><c:out value="${lang.getCreator()}"/></td>
							<td><c:out value="${lang.getCurrentVersion()}"/></td>
							<td><a href="/languages/delete/<c:out value="${languages.indexOf(lang)}"/>">Delete</a>&nbsp;|&nbsp;<a href="/languages/edit/<c:out value="${languages.indexOf(lang)}"/>">Edit</a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<br>
				<form:form action="/languages" method="POST" modelAttribute="language">
					<p><form:label path="name">Name
					<span class="error"><form:errors path="name"/></span>
					<form:input path="name" class="full"/></form:label></p>
					
					<p><form:label path="creator">Creator
					<span class="error"><form:errors path="creator"/></span>
					<form:input path="creator" class="full"/></form:label></p>
					
					<p><form:label path="currentVersion">Current Version
					<span class="error"><form:errors path="currentVersion"/></span>
					<form:input path="currentVersion" class="full"/></form:label></p>
					
					<input type="submit" value="Create Language" class="submit">
				</form:form>
			</div>
			<div class="col-4"></div>
		</div>	
	</body>
</html>