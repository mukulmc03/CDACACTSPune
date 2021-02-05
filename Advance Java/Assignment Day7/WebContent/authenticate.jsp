<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authenticate Page</title>
</head>

<jsp:useBean id="voter" class="beans.VoterBeans" scope="session"/>
<jsp:setProperty property="*" name="voter"/>

<body>
<%--session.getAttribute("voter").validateUser() --%>
<jsp:forward page="${sessionScope.voter.validateUser()}.jsp"/>
</body>
</html>	