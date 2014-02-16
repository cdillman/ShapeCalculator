<%-- 
    Document   : shapeCalculatorResult
    Created on : Feb 16, 2014, 5:11:16 AM
    Author     : Corbin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shape Calculator</title>
    </head>
    <body>
        <h1>Shape Calculator</h1>
        
        <%
           
            String msg = "Error ";
            Object objMsg = request.getAttribute("msg");
            msg = objMsg == null ? msg : objMsg.toString();
        %>
            
            
            
        <h2><%= msg %> </h2>
    </body>
</html>
