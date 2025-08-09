<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project 01</title>
</head>
<body>
	<%
		int a=Integer.parseInt(request.getParameter("num1"));		
		int b=Integer.parseInt(request.getParameter("num2"));
		int c=a+b;	
		out.println("Sum of "+a+" & "+b+" is "+c);
	%>
</body>
</html>