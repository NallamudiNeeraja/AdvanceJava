package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pdt")
public class AddProductServelet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		ProductBean pb=new ProductBean();
		pb.setPcode(req.getParameter("pcode"));
		pb.setPName(req.getParameter("pname"));
		pb.setPCompany(req.getParameter("pcom"));
		pb.setPPrice(req.getParameter("pprice"));
		pb.setPQty(req.getParameter("pqty"));
		
		AddProductDAO PDAO=new AddProductDAO();
		int rowcount=PDAO.insertProductData(pb);
		if(rowcount>0) {
		req.setAttribute("msg","Data Inserted Sucessufully");
		req.getRequestDispatcher("AddProduct.jsp").forward(req,res);
	}
		else {
			req.setAttribute("msg", "product Data Not Inserted <br><br>");
			req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		}
}}
