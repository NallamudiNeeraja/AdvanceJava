package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout1")
public class LogoutServlet 
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	HttpSession session=req.getSession();
	if(session==null)
	{
		req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	}
	else {
		req.getRequestDispatcher("Logout.jsp").forward(req, res);
	}
}
}
