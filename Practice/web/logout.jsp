<%-- 
    Document   : logout
    Created on : Nov 21, 2018, 3:00:36 PM
    Author     : Shubham Mishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% session.invalidate(); 
response.sendRedirect("Login.jsp");
%>
