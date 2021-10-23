package com.util.assignment;

import java.util.Scanner;

public class SubsetPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String str=sc.next().trim();
		int len=str.length();
		int n=(2*len)-1;
		String[] arr=new String[n];
		for(int i=0;i<len;i++)
		{
			String s="";
			for(int j=i;j<len;j++)
			{
				s+=str.charAt(j);
			}
			
			System.out.println(s);
		}
	}

}
