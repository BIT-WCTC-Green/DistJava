<%@ page import = "java.io.*,java.util.*" %>
<%
    Date createTime = new Date(session.getCreationTime());
    Date lastAccessTime = new Date(session.getLastAccessedTime());
    String title = "Welcome Back to my website";
    String userIDKey = new String("userID");
    String userID;

    if (session.isNew() ){
        userID = new String("ABCD");
        session.setAttribute(userIDKey, userID);
    }
%>

<html>
<head>
    <title>Session Tracking</title>
</head>

<body>
<h1>Session Tracking</h1>
<table border = "1" align = "center">
    <tr bgcolor = "#d3d3d3"><th>Session info</th><th>Value</th></tr>
    <tr><td>id</td><td><% out.print( session.getId()); %></td></tr>
    <tr><td>Creation Time</td><td><% out.print(createTime); %></td></tr>
    <tr><td>Time of Last Access</td><td><% out.print(lastAccessTime); %></td></tr>
    <tr><td>User ID</td><td><% out.print((String)session.getAttribute(userIDKey)); %></td></tr>
    </table>
</body>
</html>
