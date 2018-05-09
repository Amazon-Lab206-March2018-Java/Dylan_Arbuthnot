<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Person</title>
	</head>
	<body>
		<h1>New Person</h1>
		<form:form action="/persons/new" method="post" modelAttribute="person">
		<table>
			<tbody>
				<tr>
					<td><form:label path="firstName">First Name <span class="error"><form:errors path="firstName"/></span></td>
				</tr>
				<tr>
					<td><form:input path="firstName"/></form:label></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name <span class="error"><form:errors path="lastName"/></span></td>
				</tr>
				<tr>
					<td><form:input path="lastName"/></form:label></td>
				</tr>
				<tr>
					<td><input type="submit" value="Create"/></td>
				</tr>
			</tbody>
		</table>
		</form:form>
	</body>
</html>