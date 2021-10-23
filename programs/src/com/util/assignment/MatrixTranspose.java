package com.util.assignment;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column size of matrix ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		int[][] temp_arr=new int[col][row];
		System.out.println("enter elements of the matrix ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				temp_arr[j][i]=arr[i][j];
			}
		}
		
		System.out.println("Transpose:");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(arr[j][i]+" ");
				
			}
			System.out.println();
		}

	}

}
