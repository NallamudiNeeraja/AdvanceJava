package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/cal")
public class MainServelt extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		 res.setContentType("text/html");
	     PrintWriter pw = res.getWriter();

		 int fnum = Integer.parseInt(req.getParameter("fnum"));
	     int snum = Integer.parseInt(req.getParameter("snum"));
		String data=req.getParameter("option");
		switch(data)
		{
		case "add":
			pw.println("<center> <h1>");
			int result = fnum+snum;
			pw.println("The Addition of Two numbers "+result);
			pw.println("</center> </h1>");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			break;
			
		case "sub":
			pw.println("<center> <h1>");
			int subtraction = fnum-snum;
			pw.println("The Subtraction of Two numbers"+subtraction);
			pw.println("</center> </h1>");
			RequestDispatcher rd1=req.getRequestDispatcher("index.html");
			rd1.include(req, res);
			
			break;
		case "mul":
			pw.println("<center> <h1>");
			int Multiplication = fnum*snum;
			pw.println("The Multiplication of Two numbers"+Multiplication);
			pw.println("</center> </h1>");
			RequestDispatcher rd2=req.getRequestDispatcher("index.html");
			rd2.include(req, res);
			
			break;
		case "div":
			 pw.println("<center> <h1>");
			 if (snum != 0) {
				 double div = (double) fnum / snum;
				 pw.println("The Division of Two numbers"+div);
				 pw.println("</center> </h1>");
				 RequestDispatcher rd3=req.getRequestDispatcher("index.html");
				rd3.include(req, res);
					
			 }
			 else {
				 pw.println("Cannot divide by zero");
			 }
			 
			 break;
		 default:
			 pw.println("<center> <h1>");
             pw.println("<h2>Please select a valid operation!</h2>");
             pw.println("</center> </h1>");
             RequestDispatcher rd3=req.getRequestDispatcher("index.html");
     		rd3.include(req, res);
     		
             
		}
		
		
	}

}
