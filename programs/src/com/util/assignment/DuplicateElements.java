package com.util.assignment;

import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner (System.in);
		int size=sc.nextInt();
		System.out.println("enter the elements: ");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
			int temp=arr[i];
			int count=0;
			for(int j=i+1;j<size;j++)
			{

				if(arr[j]==temp && temp!=0)
				{
					if(count==0)
						System.out.print(temp+" ");
					arr[j]=0;
					count++;
				}
			}
		}
		
	}
}
