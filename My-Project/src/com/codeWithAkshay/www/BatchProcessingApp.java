package com.codeWithAkshay.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingApp 
{

	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		//Declare The Queries
		String qry1="insert into student values(103,'Alian','Delhi')";
		String qry2="update student set sname='Alan' where sname='Alian'";
		String qry3="delete from student where sid=106";
		//Add the queries to batch 
		//st.addBatch(qry1);
		//st.addBatch(qry2);
		st.addBatch(qry3);
		//execute the batch
		int[] arr=st.executeBatch();
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("Number of Records Effected are:"+sum);
		st.close();
		con.close();
	}

}
