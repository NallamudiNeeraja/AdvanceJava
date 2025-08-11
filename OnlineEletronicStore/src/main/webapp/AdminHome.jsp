<%@page import="com.pack1.AdminBean" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        background-color: #e3f2fd;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }
    center {
        margin-top: 100px;
    }
    h2 {
        background-color: #ffffff;
        padding: 40px;
        border-radius: 12px;
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        display: inline-block;
    }
    a {
        display: inline-block;
        margin: 10px 15px;
        padding: 10px 25px;
        background-color: #1976d2;
        color: #fff;
        text-decoration: none;
        border-radius: 6px;
        font-weight: bold;
        transition: background-color 0.3s;
    }
    a:hover {
        background-color: #1565c0;
    }
    .error {
        color: #fff;
        background-color: #e53935;
        padding: 10px 20px;
        border-radius: 6px;
        font-weight: bold;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);
    }
</style>
</head>
<body>
<center>
<h2>
<%
AdminBean bean = (AdminBean) session.getAttribute("bean");
if (bean == null) {
    String data = (String) request.getAttribute("msg");
%>
    <div class="error"><%= data %></div>
<%
} else {
    out.println("Welcome: " + bean.getUname() + "<br><br>");
%>
    <a href="AddProduct.html">AddProduct</a>
    <a href="view1">ViewProduct</a>
    <a href="logout1">LogOut</a>1
<%
}
%>
</h2>
</center>
</body>
</html>
