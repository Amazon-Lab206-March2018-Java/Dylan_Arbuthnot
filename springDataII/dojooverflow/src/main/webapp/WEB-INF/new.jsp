<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>New Question</title>
	</head>
	<body>
	<div class="row">
		<div class="col-12 nav-bar bg-black center-text">
			<ul class="inline-nav left">
				<li><a href="/">Home</a></li>
				<li><a href="/questions/new">New Question</a></li>
			</ul>
		</div>
	</div>
	<div class="row">
		<div class="col-2"></div>
		<div class="col-8 bg-white">
			<div class="header center-text content">
				<h1>What is your question?</h1>
			</div>
			<form:form action="/questions/create" method="post" modelAttribute="q">
				<table class="center">
					<tbody>
						<tr>
							<td><form:label path="question">Question <span class="error"><form:errors path="question"/></span></td>
						</tr>
						<tr>
							<td><form:textarea path="question" class="full-w"/></form:label></td>
						</tr>
						<tr>
							<td><label for="tags">Tags </td>
						</tr>
						<tr>
							<td><input type="text" name="tag1" class="third-w">
								<input type="text" name="tag2" class="third-w">
								<input type="text" name="tag3" class="third-w"></td>
						</tr>
						<tr>
							<td><input type="submit" value="Ask!" class="submit"></td>
						</tr>
					</tbody>
				</table>
			</form:form>
		</div>
		<div class="col-2"></div>
	</div>
		
	</body>
</html>