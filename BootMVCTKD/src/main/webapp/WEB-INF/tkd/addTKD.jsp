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
		<label for="technique">Technique:</label> 
			<input type="text" name="technique" /> 
			<br>
			<br> 
		<label><input type="radio" name="type" value="stike">Strike</label> 
			<label><input type="radio" name="type" value="kick">Kick</label> 
			<label><input type="radio" name="type" value="block">Block</label> 
			<label><input type="radio" name="type" value="stance">Stance</label> 
			<label><input type="radio" name="type" value="form">Form</label> 
			<br>
			<br> 
			<select name="belt">
				<option value="White Belt">White Belt</option>
				<option value="Yellow Belt">Yellow Belt</option>
				<option value="Orange Belt">Orange Belt</option>
				<option value="Orange Belt with Black Stripe">Orange Belt with Black Stripe</option>
				<option value="Green Belt">Green Belt</option>
				<option value="Green Belt with Black Stripe">Green Belt with Black Stripe</option>
				<option value="Blue Belt">Blue Belt</option>
				<option value="Blue Belt with Black Stripe">Blue Belt with Black Stripe</option>
				<option value="Red Belt">Red Belt</option>
				<option value="Red Belt with Black Stripe">Red Belt with Black Stripe</option>
				<option value="Black Belt">Black Belt</option>
		</select> <br> <br> <label for="description">Description:</label> <textarea
				name="description"></textarea> <br>
			<label><input type="submit" value="Add Technique"></label>
	</form>
	<br>
	<form action="home.do">
		<input type="submit" value="Cancel, return Home" />
	</form>
</body>
</html>