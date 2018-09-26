<%
    Cookie items = new Cookie("items", request.getParameter("items"));
    // Set expiry date after 24 Hrs for both the cookies.
    items.setMaxAge(60*60*24);
    response.addCookie( items );
%>

<html>
<head>
    <title>Setting Cookies</title>
</head>

<body>
<h1>Setting Cookies</h1>
<p><b>Items:</b>
    <%= request.getParameter("items")%>
</p>
<a href="bill.jsp">Bill</a>
</body>
</html>
