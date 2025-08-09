<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info about Expression</title>
</head>
<body>
<%
out.println("Expression (&lt;%= ... %&gt;)<br>" +
        "Definition:<br>" +
        "An expression is shorthand for printing something to the output.<br>" +
        "Whatever you put inside is automatically evaluated and printed.");
        out.println("<pre><code>&lt;%\n" +
                "   String name = &quot;Hariharan&quot;;\n" +
                "%&gt;\n" +
                "&lt;p&gt;Welcome, &lt;%= name %&gt;!&lt;/p&gt;</code></pre>");

%>
</body>
</html>