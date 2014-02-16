<%-- 
    Document   : shapeCalculatorInput
    Created on : Feb 16, 2014, 5:10:57 AM
    Author     : Corbin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Area of a Rectangle</h1>
        
        <form id="rectangleForm" method="POST" action="shapes?calcType=rectangle">
        L 
        <input type="text" name="len" placeholder="2.0"/>
        W
        <input type="text" name="wid" placeholder="2.0"/>
        
        <input type="submit" name="submit" value="Calculate Unknown Side"/>
        
        </form>
        
    <h1>Area of a Circle</h1>
    
        <form id="circleForm" method="POST" action="shapes?calcType=circle">
        Radius
        <input type="text" name="radius" placeholder="2.0"/>
        
        <button id="circ"> Find Area </button>
        
        </form>
    
    <h1> Third Side of Right Angle Triangle</h1>
    
        <form id="triangleForm" method="POST" action="shapes?calcType=triangle">
        A
        <input type="text" name="a" placeholder="2.0"/>
        B
        <input type="text" name="b" placeholder="2.0"/>
        
        <button id="tri"> Find Area </button>
        
        </form>
    </body>
</html>
