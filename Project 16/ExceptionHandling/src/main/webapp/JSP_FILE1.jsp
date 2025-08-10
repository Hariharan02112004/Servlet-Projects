<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP FILE 01</title>
</head>
<body>
<%
	int a =Integer.parseInt(request.getParameter("num1"));
	int b =Integer.parseInt(request.getParameter("num2"));
	int c =a/b;
	out.println("The division of "+a+ " & "+b+" is "+c);
%>
</body>
</html>