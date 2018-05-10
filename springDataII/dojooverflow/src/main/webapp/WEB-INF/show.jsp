<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<title>Question</title>
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
			<div class="header content center-text">
				<h2><c:out value="${question.getQuestion()}"/></h2>
				<span class="label">Tags: </span>
				<c:forEach var="tag" items="${question.getTags()}">
						<span class="tag bg-grey-1 text-white"><c:out value="${tag.getSubject()}"/></span>
				</c:forEach>
			</div>
			<div class="col-6">
				<table>
					<thead>
						<th>Answers</th>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${question.getAnswers().size() > 0}">
								<c:forEach var="ans" items="${question.getAnswers()}">
									<tr>
										<td><c:out value="${ans.getAnswer()}"/></td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td>No one has answered this question yet! Be first to answer with the box on the right.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</div>
			<div class="col-6">
				<form:form action="/answers/create" modelAttribute="ans" method="post">
					<form:label path="answer">Answer <span class="error"><form:errors path="answer"/></span>
					<form:textarea path="answer" class="full-w"/></form:label>
					<input type="hidden" name="question" value="${question.getId()}"/>
					<input type="submit" value="Answer it!" class="submit">
				</form:form>
			</div>
		</div>
		<div class="col-2"></div>
	</div>
		
	</body>
</html>