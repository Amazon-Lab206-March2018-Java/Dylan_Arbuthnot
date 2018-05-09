<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Ninja</title>
	</head>
	<body>
		<h1>New New Ninja</h1>
		<form:form action="/ninjas/create" modelAttribute="ninja" method="post">
			<table>
				<tbody>
					<tr>
						<td><form:label path="dojo">Dojo
					</tr>
					<tr>
						<td><form:select path="dojo">
								<c:forEach var="dojo" items="${dojos}">
									<form:option value="${dojo}" label="${dojo.getName()}"/>
								</c:forEach>
							</form:select></form:label>
						</td>
					</tr>
					<tr>
						<td><form:label path="firstName">First Name <form:errors path="firstName"/>
					</tr>
					<tr>
						<td><form:input path="firstName"/></form:label></td>
					</tr>
					<tr>
						<td><form:label path="lastName">Last Name <form:errors path="lastName"/>
					</tr>
					<tr>
						<td><form:input path="lastName"/></form:label></td>
					</tr>
					<tr>
						<td><form:label path="age">Age <form:errors path="age"/>
					</tr>
					<tr>
						<td><form:input type="number" path="age"/></form:label></td>
					</tr>
					<tr>
						<td><input type="submit" value="Create"/></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</body>
</html>