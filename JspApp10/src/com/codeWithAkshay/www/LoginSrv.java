package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSrv extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		//set the data to bean object
		LoginBean lb=new LoginBean();
		lb.setUsername(uname);
		lb.setPassword(pwd);
		
		//set the attribute to request object
		req.setAttribute("bean", lb);
		
		if(pwd.equals("admin"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("error.jsp");
		
			rd.forward(req, res);
		}
	}
}
