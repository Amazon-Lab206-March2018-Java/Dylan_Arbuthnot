<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Roster</title>
	</head>
	<body>
		<h3>Prototype Roster</h3>
		<form action="Teams">
			<input type="hidden" name="create_team" value="true">
			<input type="submit" value="New Team">
		</form>
		<table>
			<thead>
				<th>Team</th>
				<th>Players</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach var="team" items="${teams}">
					<tr>
						<td><c:out value="${team.getTeamName()}"/></td>
						<td><c:out value="${team.getPlayers().size()}"/></td>
						<td><a href="Teams?id=<c:out value="${team.getId()}"/>">Details</a> | <a href="Delete?team_id=<c:out value="${team.getId()}"/>">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>