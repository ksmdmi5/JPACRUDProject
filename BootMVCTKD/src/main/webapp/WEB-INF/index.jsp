<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<ul>
		<c:forEach items="${tkd}" var="tkd">
			<li><a href="getBelt.do?belt=${tkd.belt}">${tkd.belt}</a></li>
		</c:forEach>
	</ul>
</body>
</html>