<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int factorial(int n)
{
	int fact=1;
	for(int i=n;i>=1;i--)
	    fact=fact*i;
	return fact;
}
%>
<%
  int num=Integer.parseInt(request.getParameter("value"));
  int result=factorial(num);
  out.println("<h1> Factorial : "+result+"</h1><br>");
%>
<%@ include file="index.html" %>
</body>
</html>