package com.codeWithAkshay.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter
{
	public void init(FilterConfig config)throws ServletException
	{
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<center>Filter Invoke Before</center><br>");
		chain.doFilter(req, res);
		pw.println("<center>Filter Invoke After</center><br>");
		
	}
	
	public void destroy()
	{
		
	}

}

