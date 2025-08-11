package pack1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServelet")
public class FactorialServelet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num=Integer.parseInt(req.getParameter("val"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		pw.println("<center><h1>");
		pw.println("Factorial for "+num+" is "+fact);
		pw.println("</center></h1>");
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
	}

}
