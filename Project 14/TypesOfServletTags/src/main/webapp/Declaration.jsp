<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Info about Declaration</title>
</head>
<body>
<%
out.println("<pre><code>Declaration (&lt;%! ... %&gt;)</code></pre>" +
        "<p>Definition:<br>" +
        "Declarations are used to declare variables or methods at the class level in the generated servlet — so they can be reused in multiple requests</p>");
out.println("<pre><code>&lt;%! \n" +
        "   int counter = 0; \n" +
        "   public int incrementCounter() {\n" +
        "       return ++counter;\n" +
        "   }\n" +
        "%&gt;\n\n" +
        "&lt;p&gt;Counter value: &lt;%= incrementCounter() %&gt;&lt;/p&gt;</code></pre>");
 %>

</body>
</html>