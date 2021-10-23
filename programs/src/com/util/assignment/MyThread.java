package com.util.assignment;

public class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}

