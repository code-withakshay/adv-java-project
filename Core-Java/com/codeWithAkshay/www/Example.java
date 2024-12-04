package com.codeWithAkshay.www;

import java.util.Scanner;

public class Example 
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number:");
		int num=sc.nextInt();
		
		String binaryStr=Integer.toBinaryString(num);
		System.out.println("Number:"+num+"  Binary:"+binaryStr);
		
		int sum=0;
		for(int i=0;i<binaryStr.length();i++)
		{
			char ch=binaryStr.charAt(i);
			if(ch=='1')
			{
				sum+=1;
			}
		}
		System.out.println("Sum of Binary number="+sum);
	}
}
