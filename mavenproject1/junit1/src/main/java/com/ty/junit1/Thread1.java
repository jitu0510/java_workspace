package com.ty.junit1;

public class Thread1 {
	public static void main(String[] args) {
		MathUtils m=new MathUtils();
		Thread t1=new Thread (()-> System.out.println(m.add(10, 20)));
		Thread t2=new Thread (()-> System.out.println(m.add(30, 40)));
		t1.start();
		t2.start();
	}

}
