package com.codeWithAkshay.www;

import java.util.Arrays;

public class HrelloWorld {

	public static void main(String[] args) 
	{
		 int[] arr = {7, 1, 6, 2, 3, 5};
		 
		 int sum_of_ele=arr.length+1;
		 int sum=sum_of_ele*(sum_of_ele+1)/2;
		 
		 for(int i:arr)
		 {
			 sum=sum-i;
		 }
		 System.out.println(sum);
		 int[] newArr = Arrays.copyOf(arr, arr.length + 1);
		 newArr[arr.length]=sum;
		 for(int i:newArr)
		 {
			 System.out.print(i+" ");
		 }
		 Arrays.sort(newArr);
		 System.out.println();
		 for(int i:newArr)
		 {
			 System.out.print(i+" ");
		 }
		
	}

}
