
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pack1.ProductBean" %>
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
<h2>
<%
ArrayList<ProductBean> al=(ArrayList<ProductBean>)request.getAttribute("list");
if(al.size()==0)
{
	out.println("Data Not Inserted");
}
else{
	Iterator<ProductBean> i=al.iterator();
	while(i.hasNext())
	{
		ProductBean bean=i.next();
		out.println(bean.getPcode()+" "+bean.getPName()+" "+bean.getPCompany()+" "+bean.getPPrice()+" "+bean.getPQty());
	}
}


%>


</h2>

</center>
</body>
</html>