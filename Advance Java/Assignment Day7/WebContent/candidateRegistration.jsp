<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Candidate Registration Page</title>
</head>
<body>
	<h4 style="color: red;">${sessionScope.candidate.message}</h4>
	<h3 align="center">New Candidate Registration</h3>
	<form action="checkRegistration.jsp" method="post">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Your Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Enter Your Party</td>
				<td><input type="text" name="party" /></td>
			</tr>
			<tr>
				<td>Enter Your DOB</td>
				<td><input type="date" name="dob" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>