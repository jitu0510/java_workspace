package com.util.assignment;

import java.util.Iterator;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList(5);
		arrayList.addElements(10);
		arrayList.addElements(20);
		arrayList.addElements("jitu");
		arrayList.removeElement(20);
		Iterator it = arrayList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
