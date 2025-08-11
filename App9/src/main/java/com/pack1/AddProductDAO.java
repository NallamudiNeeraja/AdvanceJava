package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO
{
	public int insertProductData(ProductBean bean) 
{
		int Rowcount=0;
try 
{
	Connection conn=DBConnect.getcon();
	 PreparedStatement pstm=conn.prepareStatement("insert into Product values(?,?,?,?,?)");
	 pstm.setString(1, bean.getPcode());
	 pstm.setString(2, bean.getPName());
	 pstm.setString(3, bean.getPCompany());
	 pstm.setString(4, bean.getPPrice());
	 pstm.setString(5, bean.getPQty());
	 Rowcount=pstm.executeUpdate();
}
catch(Exception e)
{
	e.printStackTrace();
}
return Rowcount;
}}
