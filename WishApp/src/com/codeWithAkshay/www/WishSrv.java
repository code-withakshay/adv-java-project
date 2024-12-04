package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishSrv extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		Calendar c=Calendar.getInstance();
		int h=c.get(Calendar.HOUR_OF_DAY);
		
		if(h<12)
			pw.println("<center><h1>Good Morning</h1></center>");
		else if(h<16)
			pw.println("<center><h1>Good Afternoon</h1></center>");
		else if(h<20)
			pw.println("<center><h1>Good Evening</h1></center>");
		else
			pw.println("<center><h1>Good Night</h1></center>");
		
		pw.close();
	}
}

