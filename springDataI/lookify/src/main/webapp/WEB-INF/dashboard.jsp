<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Lookify | Dashboard</title>
	</head>
	<body>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white">
			<a href="/songs/new" class="left">Add New</a><span class="left">&nbsp;|&nbsp;</span><a href="/songs/topTen" class="left">Top Songs</a>
				<form action="/search">
					<input type="submit" value="Search" class="right">
					<input type="text" placeholder="Search artists" name="artist" class="right">
				</form>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8 white center-text">
				<h1>Lookify</h1>
				<table class="center">
					<thead>
						<th>Title</th>
						<th>Artist</th>
						<th>Rating (1-10)</th>
						<th>Actions</th>
					</thead>
					<tbody>
						<c:forEach var="song" items="${songs}">
							<tr>
								<td><a href="/songs/<c:out value="${song.getId()}"/>"><c:out value="${song.getName()}"/></a></td>
								<td><a href="/search/?artist=<c:out value="${song.getArtist()}"/>"><c:out value="${song.getArtist()}"/></td>
								<td><c:out value="${song.getRating()}"/></td>
								<td><a href="/songs/edit/<c:out value="${song.getId()}"/>">Edit</a>&nbsp;|&nbsp;<a href="/songs/delete/<c:out value="${song.getId()}"/>">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-2"></div>
		</div>
	</body>
</html>