<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>License Index</title>
	</head>
	<body>
		<h1>Information</h1>
		<table>
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>License #</th>
				<th>State</th>
				<th>Expiration Date</th>
			</thead>
			<tbody>
				<c:forEach var="person" items="${persons}">
				<tr>
					<td><c:out value="${person.getFirstName()}"/></td>
					<td><c:out value="${person.getLastName()}"/></td>
					<td><c:out value="${person.getLicense().getNumber()}"/></td>
					<td><c:out value="${person.getLicense().getState()}"/></td>
					<td><c:out value="${person.getLicense().getExpirationDate()}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<p><a href="/persons/new">Create Person</a>&nbsp;|&nbsp;<a href="/licenses/new">New License</a></p>
	</body>
</html>