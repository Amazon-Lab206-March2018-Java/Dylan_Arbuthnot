<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/style.css" media="screen" title="no title"  charset="utf-8">
        <title>Ninja Gold</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="hud">
                <p>Your Gold:</p>
                <span><c:out value="${gold}"/></span>
                <span class="reset"><a href="reset">Reset</a></span>
            </div>
            <div class="location" id="jail">
                <h2>Jail</h2>
                <p>You should have paid that debt...</p>
                <form action="reset">
                    <input type="submit" name="find_gold" value="Reset">
                </form>
            </div> <br>
            Activites:
            <div id="activites">
            	<c:forEach var="activity" items="${log}">
            			<span class="<c:out value="${activity.getKey()}"/>"><c:out value="${activity.getValue()}"/></span><br>
            	</c:forEach>
            </div>
        </div>
    </body>
</html>