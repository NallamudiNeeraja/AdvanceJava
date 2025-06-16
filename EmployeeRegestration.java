package com.pack2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeRegestration 
{
String Driver="oracle.jdbc.OracleDriver";
String dbUrl="jdbc:oracle:thin:@localhost:1521:orcl";
String dbUsername="system";
String dbpassword="1234";
Connection connect()
{
	Connection con=null;
	try 
	{
		Class.forName(Driver);
		con=DriverManager.getConnection(dbUrl,dbUsername,dbpassword);
		System.out.println("connection created");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return con;	
}
Scanner sc=new Scanner(System.in);
void meth1()
{
	 System.out.println("welcome to EmployeeRegestration");
	 Connection con=connect();
	 try 
	 {
		 PreparedStatement pstm1=con.prepareStatement("insert into EmployeeRegistration values(?,?,?,?,?,?,?)");
		 PreparedStatement pstm2=con.prepareStatement("select * from EmployeeRegistration where eid=? AND PASSWORD=?");
		 PreparedStatement pstm3=con.prepareStatement("select * from EmployeeRegistration ");
		 PreparedStatement pstm4=con.prepareStatement("update EmployeeRegistration set FName=? where eid=?");
		 
		 
			System.out.println("Enter employee Id");
			int empid=Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee password");
			int emppsw=Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee FName");
			String fname=sc.nextLine();
			System.out.println("Enter employee LName");
			String LName=sc.nextLine();
			System.out.println("Enter employee addr");
			String addr=sc.nextLine();
			System.out.println("Enter employee MailId");
			String MailId=sc.nextLine();
			System.out.println("Enter employee phoneNumber");
			Long phn=Long.parseLong(sc.nextLine());
			pstm1.setInt(1, empid);
			pstm1.setInt(2,emppsw);
			pstm1.setString(3, fname);
			pstm1.setString(4, LName);
			pstm1.setString(5, addr);
			pstm1.setString(6, MailId);
			pstm1.setLong(7, phn);
			int rowcount=pstm1.executeUpdate();
			if(rowcount>0)
			{
				System.out.println("Employee Register Sucessfully");
			}
			else {
				System.out.println("Enter coreect details");
			}
			System.out.println("**********************");
			System.out.println("Welcome to Login");
			System.out.println("Enter employee id");
			int empid1=Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee password");
			int emppsw1=Integer.parseInt(sc.nextLine());
			
			pstm2.setInt(1, empid1);
			pstm2.setInt(2, emppsw1);
			ResultSet rs=pstm2.executeQuery();
			if(rs.next())
			{
				System.out.println("Login sucessfull");
				System.out.println("******************");
				while(true) {
				System.out.println("Select the option");
				System.out.println("1) view Profile");
				System.out.println("2) Update Profile");
				System.out.println("3) Exit");
				int choice=Integer.parseInt(sc.nextLine());
				switch(choice)
				{
				case 1:
					System.out.println("Employee Details");
					ResultSet rs1=pstm3.executeQuery();
					while(rs1.next())
					{
					     System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getString(5)+" "+rs1.getString(6)+" "+rs1.getString(7));
					}
					break;
				case 2:
					System.out.println("Enter employee Id");
					int empid2=Integer.parseInt(sc.nextLine());
					System.out.println("Enter Updated FName?");
					String fname1=sc.nextLine();
					pstm4.setString(1, fname1);
					pstm4.setInt(2, empid2);
					int rownum=pstm4.executeUpdate();
					if(rownum>0)
					{
						System.out.println("Data Updated");
					}
					else {
						System.out.println("Data Not Updated");
					}
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid Input");
					
				}
			}}
			else
				System.out.println("Login Failed");
			
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }	
}
public static void main(String[] args)
{
	EmployeeRegestration obj=new EmployeeRegestration();
	obj.meth1();
}
}
