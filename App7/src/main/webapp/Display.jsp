<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
border:1px solid black;
width:40%;
height:30%;
padding:5px;
margin:auto;
margin-top:10px;
}

</style>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center>
<%
  String pname=request.getParameter("pname");
  String pid=request.getParameter("pid");
  String pprice=request.getParameter("pprice");
  String pquantity=request.getParameter("pquantity");
 
  out.println("<h1>");
  out.println("<marquee>****ProductDetails******</marquee><br>");
  out.println("Product Name:"+pname+"<br>");
  out.println("Product Id:"+pid+"<br>");
  out.println("Product Price:"+pprice+"<br>");
  out.println("Product Name:"+pquantity+"<br>");
  out.println("</h1>");
  out.println("</center>");



%>


</center>
</body>
</html>