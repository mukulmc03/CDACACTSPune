<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogOut Page</title>
</head>
<body>
	<h4>Hello, ${sessionScope.userDetails.userName}, you have logged out Successful!
	</h4>
	<!--invalidate session-->
	<%session.invalidate();%>
	
	<h3><a href ="login.jsp">Visit Again!</a></h3>
</body>
</html>