package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSrv extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String name=req.getParameter("t1");
		String sage=req.getParameter("t2");
		String status=req.getParameter("vflag");
		int age=0;
		
		if(status.equals("no"))
		{
			if(name=="" || name==null|| name.length()==0)
			{
				pw.println("<center>Name is mandatory</center>");
				return;
			}
			if(sage=="" || sage==null|| sage.length()==0)
			{
				pw.println("<center>Age is mandatory</center>");
				return;
			}
			else
			{
				try
				{
					age=Integer.parseInt(sage);
				}
				catch(NumberFormatException nfe)
				{
					pw.println("<center>Age must be numeric</center>");
					return;
				}
			}
		}
		
		if(status.equals("yes"))
		{
			age=Integer.parseInt(sage);
		}
		
		if(age<18)
			pw.println("<center><h1>U r not eligible to vote</h1></center>");
		else
			pw.println("<center><h1>U r eligible to vote</h1></center>");
		
		pw.close();
	}
}
