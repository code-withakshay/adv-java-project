package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateStudTableApp 
{

	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		
		String qry="create table emp2 (eid number(3)," +"ename varchar2(12),"+"ephoto BLOB)";
		
		PreparedStatement ps=con.prepareStatement(qry);
		
		int result=ps.executeUpdate();
		if(result==0)
			System.out.println(" Table created");
		else
			System.out.println(" No Table created");
		

		ps.close();
		con.close();
		
	}

}
