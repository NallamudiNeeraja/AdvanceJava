package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/fs")
public class SecoundServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String EmpName=req.getParameter("ename");
		String EmpId=req.getParameter("eid");
		double Empsal=Integer.parseInt(req.getParameter("esal"));
		int EmpExp=Integer.parseInt(req.getParameter("Eexp"));
		if(EmpExp>=5)
		{
			Empsal=Empsal+(Empsal*0.1);
		}
	
		
		pw.println("</center>");
		pw.println("*******Employee Details********");
		pw.println("<br>EmpName: "+EmpName);
		pw.println("<br>EmpId: "+EmpId);
		pw.println("<br>EmpSal: "+Empsal);
		pw.println("<br>EmpExp: "+EmpExp);
		pw.println("</center>");
	}
}
