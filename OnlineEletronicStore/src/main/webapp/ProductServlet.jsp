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
    font-family: Arial, sans-serif;
    background-color: #eef2f3;
    padding: 40px;
  }

  .content {
    background-color: white;
    border-radius: 10px;
    padding: 30px;
    width: 400px;
    margin: 0 auto;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    text-align: center;
  }

  a {
    display: block;
    margin: 10px 0;
    color: #007BFF;
    text-decoration: none;
    font-weight: bold;
  }

  a:hover {
    text-decoration: underline;
  }
</style>
</head>
<body>
<div class="content">
<%
AdminBean bean = (AdminBean)session.getAttribute("bean");
String data=(String)request.getAttribute("msg");
out.println(bean.getUname()+" "+data+"<br>");
%>
<a href="AddProduct.html">AddProduct</a><br>
<a href="view1">ViewProduct</a><br>
<a href="logout1">LogOut</a><br>
</div>
</body>
</html>
