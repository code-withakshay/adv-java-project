<%@page import="java.sql.*" buffer="8kb" language="java" %>
<% 

	String sno=request.getParameter("t1");
	
	int no=Integer.parseInt(sno);
	String name=request.getParameter("t2");
	String add=request.getParameter("t3");
	String rno=request.getParameter("t4");
	int rn=Integer.parseInt(rno);
	//insert the data in a database
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;
	String qry=null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		qry="insert into student values(?,?,?,?)";
		ps=con.prepareStatement(qry);
		
		//set the values
		ps.setInt(1,no);
		ps.setString(2,name);
		ps.setString(3,add);
		ps.setInt(4,rn);
		//execute
		result=ps.executeUpdate();
		
		if(result==0)
			out.println("No Record Inserted");
		else
			out.println("Record Inserted");
		
		ps.close();
		con.close();
	}
	catch(Exception e)
	{
		out.println(e);
	}
%>
