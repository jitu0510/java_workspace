package com.ty.hibernate.dao;

public interface StudentInterface {

	public void findAll();
	public void findData(int id);
	public void updateName(int id,String name);
	public void updatePhone(int id,int number);
	public void updateStandard(int id,String standard);
	public void updateId(int id,int newId);
	public void deleteStudent(int id);
	
}
