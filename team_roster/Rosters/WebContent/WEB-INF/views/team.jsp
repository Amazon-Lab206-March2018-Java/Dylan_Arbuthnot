<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Team</title>
	</head>
	<body>
	<c:choose>
		<c:when test="${create_team == true}">
		<h3>Create a New Team</h3>
		<form action="Teams" method="POST">
			<label for="team_name">Team Name: </label><input type="text" name="team_name" placeholder="Team name goes here">
			<input type="submit" value="Create Team">
		</form>
		</c:when>
		<c:when test="${create_team == false}">
			<h3><c:out value="${team.getTeamName()}"/></h3>
			<form action="Players">
				<input type="hidden" name="create_player" value="true">
				<input type="hidden" name="id" value="<c:out value="${team.getId()}"/>">
				<input type="submit" value="Create Player">
			</form>
			<table>
				<thead>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Actions</th>
				</thead>
				<tbody>
					<c:forEach var="player" items="${team.getPlayers()}">
						<tr>
							<td><c:out value="${player.getFirstName()}"/></td>
							<td><c:out value="${player.getLastName()}"/></td>
							<td><c:out value="${player.getAge()}"/></td>
							<td><a href="">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
	</c:choose>
	</body>
</html>