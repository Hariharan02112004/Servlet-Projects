<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="File2.jsp" %>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
<%
	int a =3;
	int b =4;	
	out.println(a+b);
%>

</body>
</html>