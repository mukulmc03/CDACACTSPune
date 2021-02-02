<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Page</title>
</head>
<body>
	<h4>User Details : </h4>
	${sessionScope.userDetails.userName}
	<h3><a href = "logout.jsp">Log Me Out</a></h3>
</body>
</html>