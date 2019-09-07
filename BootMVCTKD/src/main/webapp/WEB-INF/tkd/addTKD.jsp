<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Film</title>
</head>
<body>
	<form action="addTKD.do" method="POST">
		<label for="technique">Technique :</label> <input type="text"
			name="technique"> <br> <label for="Type">Type of
			Technique: </label> <input type="text" name="type"> <br> <label
			for="description">Description: </label> <input type="text"
			name="description"> <br> <label for="belt">Belt
			Level: </label> <input type="text" name="belt"> <br>
		<input type="submit" value="Add Technique">
	</form>
</body>
</html>