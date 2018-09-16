<%-- 
    Document   : nameList
    Created on : Feb 6, 2018, 6:40:47 PM
    Author     : andrewbiewer
--%>

<%@page import="java.util.List"%>
<%@page import="us.mattgreen.model.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<table>
			<%
			List<Name> nameList =
				(List<Name>) request.getAttribute("nameList");
			for (Name name : nameList){
			%>
			<tr>
				<td><%= name.getFirst() %></td>
				<td>
		<a href="?id=<%= name.getId() %>"><%= name.getLast() %></a>
				</td>
			</tr>
			<%
			}
			%>
		</table>
	</body>
</html>
