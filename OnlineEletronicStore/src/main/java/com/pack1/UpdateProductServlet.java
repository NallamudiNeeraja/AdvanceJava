package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ups")
public class UpdateProductServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{

	HttpSession session=req.getSession(false);
	if(session==null)
	{
		req.getRequestDispatcher("customerLogin.html").forward(req, res);
	}
	String pcode1=req.getParameter("pcode");
	ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("al");
	Iterator<ProductBean> i=al.iterator();
	ProductBean pb=null;
	while(i.hasNext())
	{
		pb=i.next();
		if(pcode1.equals(pb.getPcode()))
		{
			break;
			
		}
	}
	pb.setPcode(req.getParameter("pcode"));
	
	String poldqty=req.getParameter("pqty");//avaliable qty
	int oldQty = Integer.parseInt(poldqty); //converting to int
	int reqQty = Integer.parseInt(req.getParameter("rno"));  // requested qty and converting to int
	int updatedQty = oldQty - reqQty;
	

    String updatedQtyStr = String.valueOf(updatedQty);  // convert back to String
	pb.setPqty(updatedQtyStr);
	pb.setPcode(req.getParameter("pcode"));
	UpdateProductServletDAO dao=new UpdateProductServletDAO();
	int rowcount=dao.updateData(pb);
	if(rowcount>0)
	{
		session.setAttribute("pb",pb);
		session.setAttribute("reqQty",reqQty);
		req.setAttribute("msg", "Order placed successfully!");
        req.getRequestDispatcher("orderconfirm.jsp").forward(req, res);
	}
	else {
		 req.setAttribute("msg", "Order failed.");
         req.getRequestDispatcher("orderconfirm.jsp").forward(req, res);
	}
}
}
