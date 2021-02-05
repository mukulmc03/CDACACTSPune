<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<body>
	<h2>${sessionScope.voter.message}</h2>
	<h3>Hello, ${sessionScope.voter.userDetails.name}</h3>
	<form action="candidateRegistration.jsp" method="post">
		<input type="submit" value="New Candidate Registration">
	</form>
	<form action="adminLogout.jsp" method="post">
		<input type="submit" value="Log Out">
	</form>
</body>
</html>