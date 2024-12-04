package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RSMDApp 
{

	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		String qry="select * from student";
		
		ResultSet rs=st.executeQuery(qry);
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		System.out.println(rsmd.getColumnDisplaySize(2));
		
		rs.close();
		st.close();
		con.close();
		
	}

}
