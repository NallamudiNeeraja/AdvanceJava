
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pack1.EmpBean" %>
<%@ page import="java.util.Iterator" %> 

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
ArrayList<EmpBean> al=(ArrayList<EmpBean>)request.getAttribute("list");
if(al.size()==0)
{
	out.println("Data Not Inserted");
}
else{
	Iterator<EmpBean> i=al.iterator();
	while(i.hasNext())
	{
		EmpBean bean=i.next();
		out.println(bean.getEid()+" "+bean.getEmpFirstName()+" "+bean.getEmpLastName()+" "+bean.getEmpSalary()+" "+bean.getEmpAddress()+"<br><br>");
	}
}

%>
</h1>
<%@include file="index.html" %>
</body>
</html>