package com.codeWithAkshay.www;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CubeNumber extends TagSupport
{
	private int number;
	
	//setter method
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public int doStartTag()throws JspException
	{
		JspWriter out=pageContext.getOut();
		
		try
		{
			out.println(number*number*number);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}
