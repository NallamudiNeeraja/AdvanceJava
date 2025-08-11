package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/aes")
public class AddEmpServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	EmpBean ebean=new EmpBean();
	ebean.setEid(req.getParameter("eid"));
	ebean.setEmpFirstName(req.getParameter("efn"));
	ebean.setEmpLastName(req.getParameter("els"));
	ebean.setEmpSalary(Integer.parseInt(req.getParameter("esal")));
	ebean.setEmpAddress(req.getParameter("eAdd"));
	
	AddEmpDAO empDAOobj=new AddEmpDAO();
	int rowcount=empDAOobj.insertEmpData(ebean);
	if(rowcount>0)
	{
		req.setAttribute("msg", "Employee Data Inserted successufully <br><br>");
		req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
	}
	else {
		req.setAttribute("msg", "Employee Data Not Inserted <br><br>");
		req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
	}
}
}
