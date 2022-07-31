<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input</title>
<style>
	input[type=text], select{
		width: 100%;
		padding: 12px;
		margin: 0px 0;
		display: inline-block;
		border: 1px solid #ccc;
		border-radius: 4px;
		box-sizing: border-box;
	}
	input[type = submit]{
		width: 100%;
		background-color : blue;
		color: white;
		padding: 14px 20px;
		margin: 0px 0;
		border: none;
		border-radius: 4px;
		cursor: pointer;
	}
	input[type = submit]:hover{
		background-color: red;
	}
	div{
		border-radius: 5px;
		background-color: #f2f2f2;
		padding: 20px
	}
</style>
</head>
<body>
	<div>
		<form action="/submit" method="post">
			<label for="name">Name</label>
			<input type = "text" id = "fname" name="name" placeholder="Your Name....">
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>