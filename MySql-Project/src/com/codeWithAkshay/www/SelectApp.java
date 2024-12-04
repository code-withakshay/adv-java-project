package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectApp 
{

	public static void main(String[] args) 
	{
		final String DRIVER="com.mysql.cj.jdbc.Driver";
		final String URL="jdbc:mysql://localhost:3306/Code_With_Akshay";
		final String USERNAME="root";
		final String PASSWORD="root";
		final String QUERY="select * from student";
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try
		{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			st=con.createStatement();
			rs=st.executeQuery(QUERY);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
