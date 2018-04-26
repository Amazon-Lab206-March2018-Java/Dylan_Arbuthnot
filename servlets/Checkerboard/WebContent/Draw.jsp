<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Magical Checkerboard</title>
		<link rel="stylesheet" href="static/css/style.css">
	</head>
	<body>
		<% Integer height = 0;
		   Integer width = 0;%>
		<% if(request.getParameter("height") != null) { %>
			<% height = Integer.valueOf(request.getParameter("height").trim()); 
			   System.out.println(height);%>
		<% } %>
		<% if(request.getParameter("width") != null) { %>
			<% width = Integer.valueOf(request.getParameter("width").trim()); 
			   System.out.println(height);%>
		<% } %>
		<h1>Checkerboard: <%=width %>w x <%=height %>h</h1>
		<% for(int i = 0; i < height; i++) { %>
			<div class="row">
			<% for(int x = 0; x < width; x++) { %>
				<% if(i % 2 == 0) { %>
					<% if (x % 2 == 0) { %>
						<div class="even"></div>
					<% } else { %>
						<div class="odd"></div>
					<% } %>
				<% } else { %>
					<% if (x % 2 == 0) { %>
						<div class="odd"></div>
					<% } else { %>
						<div class="even"></div>
					<% } %>
				<% } %>
			<% } %>
			</div>
		<% } %>
	</body>
</html>