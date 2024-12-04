package com.codeWithAkshay.www;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class SelectNameApp 
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the student number");
		int no=sc.nextInt();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		String qry="delete from student where sno="+no;
		int result=st.executeUpdate(qry);
		
		if(result==0)
			System.out.println("No Record Delete");
		else
			System.out.println("Record Delete");
		
		st.close();
		con.close();

	}	
}
