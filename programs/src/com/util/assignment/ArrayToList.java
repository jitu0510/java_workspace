package com.util.assignment;

public class ArrayToList {

	public static void main(String[] args) {
		int arr[] = {10,11,11,10,12,9,15,5,5};
		
		int count=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					arr[j]=0;
					count++;
				}
			}
		}
		int temp[] = new int[arr.length-count];
		int j=0;
		System.out.println(count);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0) {
				temp[j] = arr[i];
				j++;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]+" ");
		}
	}

}
