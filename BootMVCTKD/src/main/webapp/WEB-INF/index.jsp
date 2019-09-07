<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h3>Search</h3>
	<hr>
	<form action="searchTech.do" method="GET">
		Technique Name: <input type="text" name="technique" /> <input
			type="submit" value="Find Technique" />
	</form>
	<form action="searchBelt.do" method="GET">
		Search Techniques by Belt Level: <input type="text" name="belt" /> <input
			type="submit" value="Find Techniques" />
	</form>
	<form action="searchKeyword.do" method="GET">
		Search Techniques by Keyword: <input type="text" name="keyword" /> <input
			type="submit" value="Find Techniques" />
	</form>
	<form action="searchType.do" method="GET">
		Search by Technique Type: <input type="text" name="type" /> <input
			type="submit" value="Search Type" />
	</form>
	<form action="showAll.do" method="GET">
		Show Entire Curriculum: <input type="submit" value="Submit" />
	</form>
	<br>
	<form action="addTKD.do" method="GET">
		<input type="submit" value="Add New Technique" />
	</form>
</body>
</html>