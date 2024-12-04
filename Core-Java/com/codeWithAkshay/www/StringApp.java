package com.codeWithAkshay.www;

import java.util.TreeSet; 
public class StringApp 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>(new Mycomparator());
		
		ts.add(10);
		ts.add(1);
		ts.add(5);
		ts.add(7);
		
		System.out.println(ts);
	}
}
