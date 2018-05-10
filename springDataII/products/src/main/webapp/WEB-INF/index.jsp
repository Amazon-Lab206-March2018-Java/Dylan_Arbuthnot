<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Products and Categories</title>
	</head>
	<body>
		<h1>Products</h1>
		<table>
			<thead>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Category Count</th>
			</thead>
			<tbody>
				<c:forEach var="prod" items="${products}">
					<tr>
						<td><a href="/products/show/<c:out value="${prod.getId()}"/>"><c:out value="${prod.getName()}"/></a></td>
						<td><c:out value="${prod.getDescription()}"/></td>
						<td><c:out value="${prod.getPrice()}"/></td>
						<td><c:out value="${prod.getCategories().size()}"/></td>
				</c:forEach>
			</tbody>
		</table>
		<h1>Categories</h1>
		<table>
			<thead>
				<th>Category Name</th>
				<th>Product Count</th>
			</thead>
			<tbody>
				<c:forEach var="cat" items="${categories}">
					<tr>
						<td><a href="/categories/show/<c:out value="${cat.getId()}"/>"><c:out value="${cat.getName()}"/></a></td>
						<td><c:out value="${cat.getProducts().size()}"/></td>
				</c:forEach>
			</tbody>
		</table>
		<p><a href="/products/new">New Product</a>&nbsp;|&nbsp;<a href="categories/new">New Category</a>
	</body>
</html>