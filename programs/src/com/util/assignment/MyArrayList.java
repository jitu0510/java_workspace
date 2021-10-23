package com.util.assignment;

import java.util.Iterator;

public class MyArrayList implements Iterable {

	private Object[] array;
	private int position;
	
	public MyArrayList(int size)
	{
		this.array = new Object[size];
	}
	public void addElements(Object o)
	{
		if(array.length-1 == this.position)
		{
			growSize();
		}
		this.array[position++] = o;
	}
	public void growSize()
	{
		Object temp[] = new Object[(int) ((array.length)*1.5)];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}
	
	public Object getElement(int index)
	{
		return this.array[index];
	}
	public int getSize()
	{
		return this.position;
	}
	
	private void removeIndex(int index)
	{
		for(int i=index;i<this.position;i++)
		{
			array[i] = array[i+1];
		}
		position--;
	}
	public void removeElement(Object element)
	{
		for(int i=0;i<this.position;i++)
		{
			if(this.getElement(i).equals(element)) {
				removeIndex(i);
			}
		}
	}
	public String toString()
	{
		if(position<0)
		{
			return "[]";
		}
			String str = "["+this.getElement(0);
			for(int i=1;i<position;i++)
			{
				str+=","+this.getElement(i);
			}
			str+="]";
			return str;
		
	}
	
	private class MyIterator implements Iterator{
		private int index;
		@Override
		public boolean hasNext() {
			return position>index?true:false;
			
		}

		@Override
		public Object next() {
			return getElement(index++);
		}
		
	}
	
	@Override
	public Iterator iterator() {
		
		return new MyIterator();
	}

}
