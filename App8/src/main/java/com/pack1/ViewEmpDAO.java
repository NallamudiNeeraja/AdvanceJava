package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmpDAO 
{
ArrayList<EmpBean>al=new ArrayList<EmpBean>();
public ArrayList<EmpBean> getEMPdata()
{
	try 
	{
		Connection con=DBConnect.getcon();
		PreparedStatement pstm=con.prepareStatement("select * from employee");
		ResultSet rs=pstm.executeQuery();
		while(rs.next())
		{
			EmpBean bean=new EmpBean();
			bean.setEid(rs.getString(1));
			bean.setEmpFirstName(rs.getString(2));
			bean.setEmpLastName(rs.getString(3));
			bean.setEmpSalary(rs.getInt(4));
			bean.setEmpAddress(rs.getString(5));
			al.add(bean);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
}
}
