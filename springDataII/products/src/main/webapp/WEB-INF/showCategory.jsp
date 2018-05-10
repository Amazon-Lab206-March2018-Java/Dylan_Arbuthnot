<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title><c:out value="${category.getName()}"/></title>
	</head>
	<body>
		<h1><c:out value="${category.getName()}"/></h1>
		<p>Products:</p>
		<ul>
			<c:forEach var="prod" items="${category.getProducts()}">
				<li><a href='/products/show/<c:out value="${prod.getId()}"/>'><c:out value="${prod.getName()}"/></a></li>
			</c:forEach>
		</ul>
		<p>Add Product:</p>
		<form action="/categories/<c:out value="${category.getId()}"/>/addProduct" method="post">
			<select name="products">
				<c:forEach var="prod" items="${products}">
					<c:if test="${!category.getProducts().contains(prod)}">
						<option value="${prod.getId()}" label="${prod.getName()}"/>
					</c:if>
				</c:forEach>
			</select>
			<p><input type="submit" value="Add"></p>
		</form>
	</body>
</html>