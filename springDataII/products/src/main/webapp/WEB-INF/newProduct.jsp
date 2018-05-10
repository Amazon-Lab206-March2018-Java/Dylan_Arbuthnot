<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Product</title>
	</head>
	<body>
		<h1>New Product</h1>
		<form:form action="/products/create" method="post" modelAttribute="product">
			<table>
				<tbody>
					<tr>
						<td><form:label path="name">Name <form:errors path="name"/></td>
					</tr>
					<tr>
						<td><form:input path="name"/></form:label></td>
					</tr>
					<tr>
						<td><form:label path="description">Description <form:errors path="description"/></td>
					</tr>
					<tr>
						<td><form:input path="description"/></form:label></td>
					</tr>
					<tr>
						<td><form:label path="price">Price <form:errors path="price"/></td>
					</tr>
					<tr>
						<td><form:input path="price"/></form:label></td>
					</tr>
					<tr>
						<td><input type="submit" value="Create"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</body>
</html>