<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h3>
<%
String data=(String)request.getAttribute("msg");
out.println(data);

%>
</h3>
<h3>

<h2>
<a href="product.html">Add product Details</a><br>
<a href="view">View product Details</a><br>


</h3>
</body>
</html>