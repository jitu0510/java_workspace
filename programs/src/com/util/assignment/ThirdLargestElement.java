package com.util.assignment;

import java.util.Scanner;

public class ThirdLargestElement {
	public static void main(String[] args) {
		System.out.println("enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array elements:");
		int largest=0;
		int m=0,n=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>largest) 
			{
				largest=arr[i];
				m=i;
			}
		}
		int second_largest=0;
		for(int i=0;i<size;i++)
		{
			
			if(arr[i]>second_largest && i!=m)
			{
				second_largest=arr[i];
				n=i;
			}
		}
		
		int third_largest=0;
		for(int i=0;i<size;i++)
		{
			
			if(arr[i]>third_largest && i!=n && i!=m)
			{
				third_largest=arr[i];
				
			}
		}
		System.out.println("Third Largest Element: "+third_largest);
	}
}
