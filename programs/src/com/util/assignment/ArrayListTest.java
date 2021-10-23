package com.util.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Members> arrayList=new ArrayList();
		arrayList.add(new Members("A",23));
		arrayList.add(new Members("C", 45));
		arrayList.add(new Members("B", 52));
		
		Collections.sort(arrayList,new Members());
		
		Iterator itr=arrayList.iterator();
		
		while(itr.hasNext()) {
			Members members=(Members)itr.next();
			System.out.println(members.name+" ");
		}
		
		
		

	}

}
class Members implements Comparator{
	String name;
	int age;
	
	public Members(String name,int age) {
		this.name=name;
		this.age=age;
	}


	public Members() {
		// TODO Auto-generated constructor stub
	}
	public int compare(Object o1,Object o2) {
		Members m1=(Members)o1;
		Members m2=(Members)o2;
		return m1.name.compareTo(m2.name);
	
		
	}

}
	

