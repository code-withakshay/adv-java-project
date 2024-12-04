package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv1 extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String name = req.getParameter("t1");
		String pass = req.getParameter("t2");
		
		if(pass.equals("admin"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("test2");
			rd.forward(req, res);
		}
		else
		{
			pw.println("<center><b style='color:red'>Sorry! Incorrect username or password</b></center>");
			RequestDispatcher rd=req.getRequestDispatcher("form.html");
			rd.include(req, res);
		}
		
		pw.close();
	}
}
