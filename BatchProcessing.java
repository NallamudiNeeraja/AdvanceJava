package com.pack3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class BatchProcessing 
{
String Driver="oracle.jdbc.OracleDriver";
String dbUrl="jdbc:oracle:thin:@localhost:1521:orcl";
String dbUsername="system";
String dbPassword="1234";
Scanner sc=new Scanner(System.in);
void meth1()
{
	System.out.println("Implementing Batch Processing");
	try 
	{
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		System.out.println("connection created");
		Statement stmt=con.createStatement();
		System.out.println("How many queries u want Enter");
		int num=Integer.parseInt(sc.nextLine());
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter "+i+" query");
			stmt.addBatch(sc.nextLine());
		}
		System.out.println("All"+num+"qeries entered into batch");
		int[] arr=stmt.executeBatch();
		System.out.println(Arrays.toString(arr));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args)
{
	BatchProcessing obj=new BatchProcessing();
	obj.meth1();
}
}
