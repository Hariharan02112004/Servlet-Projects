<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info about Directive</title>
</head>
<body>
<%
out.println("Directive (&lt;%@ ... %&gt;)<br>" +
            "Definition:<br>" +
            "Directives give instructions to the JSP engine (before the page is even turned into a servlet).<br>" +
            "Common directives: page, include, taglib.");

out.println("&lt;%@ page import=&quot;java.util.Date&quot; %&gt;<br>" +
        "&lt;%<br>" +
        "   Date date = new Date();<br>" +
        "   out.println(&quot;Current Date: &quot; + date);<br>" +
        "%&gt;");

%>

</body>
</html>