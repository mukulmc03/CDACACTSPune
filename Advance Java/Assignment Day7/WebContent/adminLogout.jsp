<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Log Out Page</title>
</head>
<body>
	<h4>Cleaning Up DB Utils!</h4>
	${sessionScope.voter.voterDao.cleanUp()}
	${sessionScope.candidate.candidateDao.cleanUp()}
	
	<%--invalidate session --%>
	${pageContext.session.invalidate()}
	<h5>Logged out successfully...</h5>
	<form action="login.jsp">
		<input type="submit" value="Visit Again"/>
	</form>
</body>
</html>