<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title><c:out value="${product.getName()}"/></title>
	</head>
	<body>
		<h1><c:out value="${product.getName()}"/></h1>
		<p>Categories:</p>
		<ul>
			<c:forEach var="cat" items="${product.getCategories()}">
				<li><a href='/categories/show/<c:out value="${cat.getId()}"/>'><c:out value="${cat.getName()}"/></a></li>
			</c:forEach>
		</ul>
		<p>Add Category:</p>
		<form action="/products/<c:out value="${product.getId()}"/>/addCategory" method="post">
			<select name="categories">
				<c:forEach var="cat" items="${categories}">
					<c:if test="${!product.getCategories().contains(cat)}">
						<option value="${cat.getId()}" label="${cat.getName()}"/>
					</c:if>
				</c:forEach>
			</select>
			<p><input type="submit" value="Add"></p>
		</form>
	</body>
</html>