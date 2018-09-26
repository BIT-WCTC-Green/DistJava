<%@ page import = "java.io.*,java.util.*" %>
<html>
<head>
    <title>Page Redirection</title>
</head>

<body>
    <h1>Page Redirection</h1>
<%
    // New location to be redirected
    String site = new String("http://google.com");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>
</body>
</html>
