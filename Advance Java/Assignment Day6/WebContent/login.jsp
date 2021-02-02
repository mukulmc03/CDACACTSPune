<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login Page</title>
</head>
<body>
<h4 align="center">Session ID <%= session %></h4>
	<form action="validate.jsp" method="post">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Username</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="pass" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>