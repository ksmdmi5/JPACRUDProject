<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	<h3>${tkd.technique}</h3>
	<p>Type: ${tkd.type}</p>
	<p>Belt Level: ${tkd.belt }</p> 
	<p>Description: ${tkd.description}</p>
	<form action="editTKD.do" method="GET">
		<input type="hidden" value="${tkd.id }" name="id"> <input
			type="submit" value="Edit Technique" />
	</form>
	<form action="deleteTKD.do" method="POST">
		<input type="hidden" value="${tkd.id }" name="id"> <input
			type="submit" value="Delete Technique" />
	</form>
	<form action="home.do">
		<input type="submit" value="Return to Home" />
	</form>
</body>
</html>