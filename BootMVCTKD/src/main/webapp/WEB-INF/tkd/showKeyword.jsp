<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty tkd }">
			<h4>Displaying Techniques</h4>
			<ul>
				<c:forEach items="${tkd}" var="tkd">
					<li><a href="getTKD.do?id=${tkd.id }">${tkd.technique}</a></li>
				</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			<h4>No Techniques Found</h4>
		</c:otherwise>
	</c:choose>
	<form action="home.do">
		<input type="submit" value="Cancel, return Home" />
	</form>
</body>
</html>