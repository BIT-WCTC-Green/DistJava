<%@ page import = "java.io.*,java.util.*" %>
<%String title = "Accessing Request Param";%>

<html>
<head>
  <title><% out.print(title); %></title>
</head>

<body>
  <h1><% out.print(title); %></h1>


<div align = "center">
  <p>B${param["username"]}B</p>
  <p>${(1 + 2) * 3}</p>
</div>
</body>
</html>
