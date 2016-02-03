<%-- 
    Document   : result
    Created on : Feb 3, 2016, 2:53:03 PM
    Author     : Taylor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
    </head>
    <body>
        <h1>The area of this <%=request.getAttribute("shape")%> is <%=request.getAttribute("area")%></h1>
        
        <br>
        <p><a href="index.html">Back</a></p>
    </body>
</html>
