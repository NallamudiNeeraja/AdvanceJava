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
<h1>

<%
String data=(String)request.getAttribute("msg");
out.println(data);
%>
</h1>

<h2>
<a href="emp.html">Add Emp Details</a><br>
<a href="view">View Emp Details</a><br>

</h2>



</center>
</body>
</html>