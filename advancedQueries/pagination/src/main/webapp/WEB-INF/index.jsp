<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Ninjas</title>
	</head>
	<body>
		<h1>Ninjas</h1>
		<c:forEach begin="1" end="${totalPages}" var="index">
        	<a href="/pages/${index}">${index}</a>
    	</c:forEach>
		
		<table>
			<thead>
				<th>Dojo Name</th>
				<th>First Name</th>
				<th>Last Name</th>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${ninjas.content}">
					<tr>
						<td><c:out value="${ninja[0]}"/></td>
						<td><c:out value="${ninja[1]}"/></td>
						<td><c:out value="${ninja[2]}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>