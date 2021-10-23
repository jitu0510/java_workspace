package com.util.assignment;

public class ShiftArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr1[]= new int[8];
		int arr2[] = new int[2];
		for(int i=0;i<2;i++)
		{
			arr2[i] = arr[i];
		}
		for(int i=2,j=0;i<10;i++,j++)
		{
			arr1[j] = arr[i];
		}
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(i<8)
			{
				arr[i]=arr1[i];
				
			}else {
				arr[i] = arr2[j];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
