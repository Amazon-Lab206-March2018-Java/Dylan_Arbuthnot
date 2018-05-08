<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Lookify | <c:out value="${song}"/></title>
	</head>
	<body>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white">
			<a href="/dashboard" class="left">Dashboard</a><span class="left">&nbsp;|&nbsp;</span><a href="/songs/new" class="left">Add New</a><span class="left">&nbsp;|&nbsp;</span><a href="/songs/topTen" class="left">Top Songs</a>
				<form action="/search">
					<input type="submit" value="Search" class="right">
					<input type="text" placeholder="Search artists" name="artist" class="right">
				</form>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white">
				<form:form method="POST" action="/songs/edit/${song.getId()}" modelAttribute="song">
					<table class="center">
						<tbody>
							<tr>
								<td><form:label path="name" class="label">Title
									<span class="error"><form:errors path="name"/></span></td>
							</tr>
							<tr>
								<td><form:input path="name" class="full"/></form:label></td>
							</tr>
							<tr>
								<td><form:label path="artist" class="label">Artist
									<span class="error"><form:errors path="artist"/></span></td>
							</tr>
							<tr>
								<td><form:input path="artist" class="full"/></form:label></td>
							</tr>
							<tr>
								<td><form:label path="rating" class="label">Rating
									<span class="error"><form:errors path="rating"/></span></td>
							</tr>
							<tr>
								<td><form:input path="rating" class="full" type="number"/></form:label></td>
							</tr>
							<tr>
								<td><input type="submit" value="Submit" class="submit"/></td>
							</tr>
						</tbody>
					</table>
				</form:form>
			</div>
			<div class="col-2"></div>
		</div>
	</body>
</html>