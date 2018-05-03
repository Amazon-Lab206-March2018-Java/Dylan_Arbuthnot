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
            <div class="location" id="farm">
                <h2>Farm</h2>
                <p>(earns 10-20 gold)</p>
                <form action="farm" method="POST">
                    <input type="submit" name="find_gold" value="Loot the Farm">
                </form>
            </div>
            <div class="location" id="cave">
                <h2>Cave</h2>
                <p>(earns 5-10 gold)</p>
                <form action="cave" method="POST">
                    <input type="submit" name="find_gold" value="Explore the Cave">
                </form>
            </div>
            <div class="location" id="house">
                <h2>House</h2>
                <p>(earns 2-5 gold)</p>
                <form action="house" method="POST">
                    <input type="submit" name="find_gold" value="Search the House">
                </form>
            </div>
            <div class="location" id="casino">
                <h2>Casino</h2>
                <p>(earns/takes 0-50 gold)</p>
                <form action="casino" method="POST">
                    <input type="submit" name="find_gold" value="Gamble at Casino">
                </form>
            </div>
            <div class="location" id="spa">
                <h2>Spa</h2>
                <p>(takes 5-20 gold)</p>
                <form action="spa" method="POST">
                    <input type="submit" name="find_gold" value="Relax at Spa">
                </form>
            </div>
            <br>
            Activites:
            <div id="activites">
            	<c:forEach var="activity" items="${log}">
            			<span class="<c:out value="${activity.getKey()}"/>"><c:out value="${activity.getValue()}"/></span><br>
            	</c:forEach>
            </div>
        </div>
    </body>
</html>