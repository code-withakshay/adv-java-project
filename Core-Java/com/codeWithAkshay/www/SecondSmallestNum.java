package com.codeWithAkshay.www;

import java.util.Scanner;

public class SecondSmallestNum {

	public static void main(String[] args) 
	{	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enetr the year");
		 int year=sc.nextInt();
		 
		 if(year%100==0 || year%4==0 && year%400==0)
		 {
			 System.out.println("This year is leap Year...");
		 }
		 else
		 {
			 System.out.println("This year is Odd Year...!!");
		 }
	}

}
