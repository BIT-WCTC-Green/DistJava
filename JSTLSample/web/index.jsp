<%@ page import="us.matt.TaskExpert" %>
<%@ page import="java.util.List" %>
<%@ page import="us.matt.ListWrapper" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Author List</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<% List list= new TaskExpert().getToDo(); %>
<c:set var="listWrapper" value="<%= new ListWrapper(list) %>" />
<h3>Iterating over ArrayList</h3>
<ul>
    <c:forEach var='item' items='${listWrapper.list}'>
        <li><c:out value='${item.task}'/> - <c:out value='${item.priority}'/></li>
    </c:forEach>
</ul>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
