package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateStudTableUsingStandProcedApp 
{

	public static void main(String[] args) 
	{
		final String DRIVER="oracle.jdbc.driver.OracleDriver";
		final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		final String USERNAME="system";
		final String PASSWORD="admin";
		final String QUERY="create table student1(sid number(3)," + "sname varchar2(12)," + "sadd varchar2(12))";
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try
		{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			ps=con.prepareStatement(QUERY);
			int result=ps.executeUpdate();
			if(result==0)
				System.out.println("Table created");
			else
				System.out.println("No Table created");
			
			ps.close();
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
