package com.util.assignment;

import java.util.Scanner;

public class ArrayShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("enter the elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter number of elements to shift:");
		int n1=sc.nextInt();
		n1%=n;
		int[] new_arr=new int[n1];
		int[] new_arr1=new int[n-n1];
		for(int i=0,j=0;i<n;i++)
		{
			if(i<n1)
				new_arr[i]=arr[i];
			else
			{
				new_arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0,j=0,k=0;i<n;i++)
		{
			if(i<n-n1) {
				arr[i]=new_arr1[j];
				j++;
			}
				
			else
			{
				arr[i]=new_arr[k];
				k++;
			}
		}
		System.out.println("Shifted array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
