<%
    /*
     * This is an example of a Java comment.
     * This is the result page where the controller sends a response
     * with the beer advice.
     */
%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Advice Response</title>
    </head>
    <body>
    <h1 align="center">Beer Recommendations (JSP)</h1>
    <p>

    <%
        List recs = (List)request.getAttribute("recommendations");
        Iterator it = recs.iterator();
        while(it.hasNext()) {
            // Notice we're outputting some HTML. Is that a good idea?
            // Also, notice we do not cast the object returned by the
            // iterator to a String. Why?
            out.print("<br>try: " + it.next());
        }
    %>
    
    <p><a href="form.html">Back
    
    </body>
</html>
