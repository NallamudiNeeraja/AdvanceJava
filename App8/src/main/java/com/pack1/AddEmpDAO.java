package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEmpDAO 
{
public int insertEmpData(EmpBean bean)
{
	int rowCount=0;
	try 
	{
		Connection con=DBConnect.getcon();
		PreparedStatement pstm=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		pstm.setString(1, bean.getEid());
		pstm.setString(2, bean.getEmpFirstName());
		pstm.setString(3, bean.getEmpLastName());
		pstm.setInt(4, bean.getEmpSalary());
		pstm.setString(5, bean.getEmpAddress());
		rowCount=pstm.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rowCount;
}
}
