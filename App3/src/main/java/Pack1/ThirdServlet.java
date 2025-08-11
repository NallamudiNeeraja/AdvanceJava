package Pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/verification")
public class ThirdServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String UserName=req.getParameter("uname");
		String password=req.getParameter("pswd");
		if(UserName.equals("Neeraja")&& password.equals("java is awesome"))
		{
			pw.println("<center> <h1>");
			pw.println("Welcome "+UserName);
			pw.println("<br>you Did The Task");
			
		}
		else {
			pw.println("<center> <h1>");
			pw.println("Welcome "+UserName);
			pw.println("<br>Invalid Credentials");
			pw.println("</center> <h1>");
		}
		
	}
}
