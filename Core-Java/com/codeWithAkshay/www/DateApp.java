package com.codeWithAkshay.www;

import java.time.LocalDate;

public class DateApp 
{
	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2024, 10,12);
		
		if(date1.compareTo(date2)>0)
			System.out.println("Date1 is Bigest");
		else if(date1.compareTo(date2)<0)
			System.out.println("Date2 is Bigest");
		else
			System.out.println("Both are same");
	}
}
