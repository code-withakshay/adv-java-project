package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv2 extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<center><h1>Login Done Successfully!</h1></center>");
		
		pw.close();
	}
}