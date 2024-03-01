<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="com.nt.ui.Userbean" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <%
        Userbean ub = (Userbean) application.getAttribute("ubean");
    %>
    <center>
        <h3 style="color: green;">
            WELCOME USER <%= ub.getFname() %>
        </h3>
    </center>

    <jsp:include page="login.html"/>
</body>
</html>
