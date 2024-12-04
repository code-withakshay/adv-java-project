package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertNewRecordApp 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the User name");
		String username=sc.next();
		
		System.out.println("Enetr the User Password");
		String pwd=sc.next();
		
		username="'"+username+"'";
		pwd="'"+pwd+"'";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		String qry="insert into userlist values("+username+","+pwd+")";
		int result=st.executeUpdate(qry);
		
		if(result==0)
		{
			System.out.println("No Record Inserted");
		}
		else
		{
			System.out.println(" Record Inserted");
		}
		st.close();
		con.close();
		sc.close();

	}

}
