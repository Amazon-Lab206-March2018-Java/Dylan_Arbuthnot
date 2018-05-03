<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Dojo Survey Index</title>
	</head>
	<body>
		<h1>Please fill out the survey</h1>
		<form action="result" method="POST">
			<table>
				<tbody>
					<tr>
						<td><label for="name">Your Name:</label></td>
						<td><input type="text" name="name" placeholder="Your name here"></td>
					</tr>
					<tr>
						<td><label for="location">Dojo Location:</label></td>
						<td><select name="location">
							<option value="Silicon Valley, CA">Silicon Valley, CA</option>
							<option value="Seattle, WA">Seattle, WA</option>
							<option value="Los Angeles, CA">Los Angeles, CA</option>
							<option value="Dallax, TX">Dallas, TX</option>
							<option value="Chicago, IL">Chicago, IL</option>
							<option value="Tulsa, OK">Tulsa, UK</option>
							<option value = "Tysons Corner, VA">Tysons Corner, VA</option>
						</select></td>
					</tr>
					<tr>
						<td><label for="language">Favorite Language:</label></td>
						<td><select name="language">
							<option value="Python">Python</option>
							<option value="Java">Java</option>
							<option value="HTML">HTML</option>
							<option value="CSS">CSS</option>
							<option value="JavaScript">JavaScript</option>
						</select></td>
					</tr>
					<tr>
						<td><label for="comment">Comment (optional):</label></td>
						<td><textarea name="comment"></textarea></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Submit"></td>
					</tr>
				</tbody>
			</table>
		</form>
	</body>
</html>