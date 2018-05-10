<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Questions Dashboard</title>
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
				<h1>Questions Dashboard</h1>
			</div>
			<table class="center">
				<thead>
					<th>Question</th>
					<th>Tags</th>
				</thead>
				<tbody>
					<c:forEach var="question" items="${questions}">
						<tr>
							<td><a href="/questions/show/<c:out value="${question.getId()}"/>"><c:out value="${question.getQuestion()}"/></a>
							<td><c:forEach var="tag" items="${question.getTags()}">
									<c:choose>
										<c:when test="${question.getTags().indexOf(tag) == question.getTags().size() - 1}">
											<c:out value="${tag.getSubject()}"/>
										</c:when>
										<c:otherwise>
											<c:out value="${tag.getSubject()}"/>,
										</c:otherwise>
									</c:choose>
								</c:forEach></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-2"></div>
	</div>
		
	</body>
</html>