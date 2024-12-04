package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv1 extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String name = req.getParameter("t1");
		String fname = req.getParameter("t2");
		String ms = req.getParameter("t3");
		
		if(ms.equals("married"))
		{
			pw.println("<form action='test2' method='POST'>");
			pw.println("Spouse Name : <input type='text' name='f2t1'/> <br>");
			pw.println("No of Child : <input type='text' name='f2t2'/> <br>");
			pw.println("<input type='submit' value='submit'/>");
			pw.println("</form>");
		}
		else
		{
			pw.println("<form action='test2' method='POST'>");
			pw.println("When will u marry : <input type='text' name='f2t1'/> <br>");
			pw.println("Why will u marry : <input type='text' name='f2t2'/> <br>");
			pw.println("<input type='submit' value='submit'/>");
			pw.println("</form>");
		}
		
		pw.close();
	}
}
