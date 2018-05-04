<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/materialize.css">
		<title>Fortran Lesson</title>
	</head>
	<body>
		<div class="row">
			<div class="container">
				<div class="col s1"></div>
				<div class="col s5">
					<h1 class="categories-container pin-top"><c:out value="${topic}"/></h1>
				</div>
				<div class="col s6">
					<ul class="list-inline">
						<li><a href="/m/38/0553/0733">Set up</a></li>
						<li><a href="/m/38/0483/0345">Forms</a></li>
						<li><a href="/m/38/0553/0342">Cards</a></li>
						<li><a href="/m/38/0568/0262">Quiz</a></li>
						<li><a href="/m/26/0553/0348">Advanced</a></li>
						<li><a href="/m/26/0483/2342">Binary</a></li>
						<li><a href="/m/26/0568/0143">Advanced Quiz</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="container">
				<div class="col s2"></div>
				<div class="col s8 card">
					<div class="card-content">
						<span class="card-title"><c:out value="${content}"/></span>
						<p>This lesson will give you information on <c:out value="${content}"/></p>
					</div>
				</div>
				<div class="col s2"></div>
			</div>
		</div>
	</body>
</html>