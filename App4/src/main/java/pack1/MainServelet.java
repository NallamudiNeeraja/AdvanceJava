package pack1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ms")
@SuppressWarnings("serial")
public class MainServelet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		String data=req.getParameter("choice");
		if(data.equals("Get factorial"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("/FactorialServelet");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("/evenservlet");
			rd.forward(req, res);
		}
	}
}
