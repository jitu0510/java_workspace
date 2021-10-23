package com.util.assignment;

public class CreateThread {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyThread());
		thread.start();
		
	 
	}
}
