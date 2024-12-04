package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv2 extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form1  data 
		String name = req.getParameter("t1");
		String fname = req.getParameter("t2");
		String ms = req.getParameter("t3");
		
		//reading form2 data
		String val1=req.getParameter("f2t1");
		String val2=req.getParameter("f2t2");
		
		pw.println("Form 1 Data :"+name+" "+fname+" "+ms+"<br>");
		pw.println("Form 2 Data :"+val1+" "+val2+"<br>");
		
		pw.close();
	}
}
