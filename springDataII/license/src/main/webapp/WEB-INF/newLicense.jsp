<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New License</title>
	</head>
	<body>
		<h1>New License</h1>
		<form:form action="/licenses/new" method="post" modelAttribute="license">
			<form:hidden path="number" value="${ln}"/>
		<table>
			<tbody>
				<tr>
					<td><form:label path="person">Person <span class="error"><form:errors path="person"/></span></td>
				</tr>
				<tr>
					<td><form:select path="person">
						<c:forEach var="person" items="${persons}">
							<c:if test="${person.getLicense() == null}">
								<form:option value="${person}" label="${person.getName()}"/>
							</c:if>
						</c:forEach>
						</form:select>
					</form:label></td>
				</tr>
				<tr>
					<td><form:label path="state">State <span class="error"><form:errors path="state"/></span></td>
				</tr>
				<tr>
					<td><form:input path="state"/></form:label></td>
				</tr>
				<tr>
					<td><form:label path="expirationDate">Expiration Date <span class="error"><form:errors path="expirationDate"/></span></td>
				</tr>
				<tr>
					<td><form:input type="date" path="expirationDate"/></form:label></td>
				</tr>
				<tr>
					<td><input type="submit" value="Create"/></td>
				</tr>
			</tbody>
		</table>
		</form:form>
	</body>
</html>