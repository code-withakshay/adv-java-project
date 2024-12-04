package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		ServletContext context=getServletContext();
		
		pw.println(context.getInitParameter("driver")+"<br>");
		pw.println(context.getInitParameter("url")+"<br>");
		
		Enumeration<String> e=context.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			pw.println(s+"<br>");
		}
		
		context.setAttribute("name","Alan");
		
		pw.println(context.getAttribute("name"));
		
		context.removeAttribute("name");
		
		pw.close();
		
	}
}

