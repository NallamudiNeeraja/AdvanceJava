package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/evenservlet")
public class CheckEvenServelet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num=Integer.parseInt(req.getParameter("val"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("<center> <h1>");
		if(num%2==0)
		{
			pw.println(num+" is Even Number");
		}
		else 
		{
			pw.println(num+" is odd Number");
		}
		pw.println("</center> </h1>");
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}

}
