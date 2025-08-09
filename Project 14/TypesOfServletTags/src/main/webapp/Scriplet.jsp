<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Info about Scriplet</title>
</head>
<body>

	<%
	out.println("Scriptlet (&lt;% ... %&gt;) \n" +
            "Definition:\n" +
            "A scriptlet lets you write Java code directly inside a JSP page.\n" +
            "The code runs when the page is requested, and you can use it to create variables, loops, conditionals, etc.");

	out.println("<pre><code>&lt;%\n" +
            "   int a = 5;\n" +
            "   int b = 10;\n" +
            "   int sum = a + b;\n" +
            "   out.println(&quot;Sum is: &quot; + sum);\n" +
            "%&gt;</code></pre>");
	
	%>
</body>

</html>