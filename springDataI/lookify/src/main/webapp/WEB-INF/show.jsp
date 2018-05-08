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
				<table class="center">
					<tbody>
						<tr>
							<td><span class="label">Title</span></td>
							<td><c:out value="${song.getName()}"/></td>
						</tr>
						<tr>
							<td><span class="label">Artist</span></td>
							<td><c:out value="${song.getArtist()}"/></td>
						</tr>
						<tr>	
							<td><span class="label">Rating (1-10)</span></td>
							<td><c:out value="${song.getRating()}"/> / 10</td>
						</tr>
						<tr>
							<td><a href="/songs/delete/<c:out value="${song.getId()}"/>">Delete</a></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-2"></div>
		</div>
	</body>
</html>