package com.codeWithAkshay.www;


public class CollectionApp 
{
	public static void main(String[] args)
	{
		//int row=5;
		int num=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=3;i>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i%2==0)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.println(num+" ");
					num=num+2;
				}
			}
			System.out.println();
		}
		for(int i=2;i>=1;i++)
		{
			for(int j=2;i>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i%2==0)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.println(num+" ");
					num=num+2;
				}
			}
			System.out.println();
		}
	}
}
