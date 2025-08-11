package Pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/product")
@SuppressWarnings("serial")
public class ThirdServelt extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String ProductName=req.getParameter("pname");
		int ProductId=Integer.parseInt(req.getParameter("pid"));
		int ProductQuantity=Integer.parseInt(req.getParameter("pquantity"));
		double ProductPrice=Integer.parseInt(req.getParameter("pprice"));
		if(ProductQuantity<=5)
		{
			ProductPrice=ProductPrice+(ProductPrice*0.10);
		}
		pw.println("<center> <h1>");
		pw.println("*******Product Details********");
			pw.println("<br>Product Name: "+ProductName);
			pw.println("<br>ProductId: "+ProductId);
			pw.println("<br>Product Quantity: "+ProductQuantity);
			pw.println("<br>Product Price: "+ProductPrice);
			pw.println("</center> </h1>");
			
		
	}
}
