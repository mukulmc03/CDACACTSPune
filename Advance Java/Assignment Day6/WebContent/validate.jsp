
<%@page import="pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate Page</title>
<%!//JSP declaration block
	String userName = "mc@gmail.com";
	String password = "123456";

	//override jsp life cycle methods
	public void jspInit() {
		System.out.println("in jsp init " + Thread.currentThread());
	}%>
</head>
<body>
<% if (userName.equals(request.getParameter("username")) && password.equals(request.getParameter("pass"))){
	out.print("<h3>Login Successfull!</h3>");
	
	User user = new User(userName, password);
	//success : store user details under suitable scope : session (since client  Pull II : redirect)
	session.setAttribute("userDetails", user);
	
	//to check if setting Attr
	//out.print("user : " + user.getUserName());
	
	//client pull
	response.sendRedirect("details.jsp");
}
else
	out.print("<h4>Invalid credentials! Please, <a href='login.jsp'>Login</a> again!");
%>

</body>
</html>