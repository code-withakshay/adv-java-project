package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class TestSrv extends HttpServlet 
{
	public void init(ServletConfig config)throws ServletException
	{
		
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<center><h1>This is service method</h1></center>");
		
		pw.close();
	}
	public void destroy()
	{
		
	}
}
