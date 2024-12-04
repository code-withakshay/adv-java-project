package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SQLInjProbApp 
{

	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the User name:");
		String name=sc.next();
		
		System.out.println("Enter the Password:");
		String pwd=sc.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		
		String qry="select count(*) from userlist where username=? and pwd=?";
		
		PreparedStatement ps=con.prepareStatement(qry);
		
		//set the values
		ps.setString(1, name);
		ps.setString(2, pwd);
		
		ResultSet rs=ps.executeQuery();
				
		int result=0;
		while(rs.next())
		{
			result=rs.getInt(1);
		}  
		if(result==0)
			System.out.println("Invalid Credentials");
		else
			System.out.println("Valid Credentials");
		
		rs.close();
		ps.close();
		con.close();
		
	}

}
