package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO 
{
ArrayList<ProductBean>al=new ArrayList<ProductBean>();
public ArrayList<ProductBean> getProductData()
{
	try
	{
		Connection con=DBConnect.getcon();
		PreparedStatement pstm=con.prepareStatement("select * from product");
		ResultSet rs=pstm.executeQuery();
		while(rs.next())
		{
			ProductBean pb=new ProductBean();
			pb.setPcode(rs.getString(1));
			pb.setPName(rs.getString(2));
			pb.setPCompany(rs.getString(3));
			pb.setPPrice(rs.getString(4));
			pb.setPQty(rs.getString(5));
			al.add(pb);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
	
}
}
