/**
 * 
 */
package com.ty.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hibernate.dto.Student;

/**
 * @author jitu
 *
 */
public class StudentImpl implements StudentInterface {

	@Override
	public void findAll() {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			String findAll="from Student";
			Query query=manager.createQuery(findAll);
			List<Student> list=query.getResultList();
			System.out.println(list);
			System.out.println("----------------------------");
			for (Student student : list) {
				System.out.println(student);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}

	@Override
	public void findData(int id) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		//EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			Student student =manager.find(Student.class,id);
			System.out.println(student);
			
		}catch (Exception e) {
		e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}


	@Override
	public void updateName(int id,String name) {

		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			Student student=manager.find(Student.class, id);
			
			student.setName(name);
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(student);
			transaction.commit();
			
			//System.out.println(employee.getDesignation());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}

	@Override
	public void updatePhone(int id,int number) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			Student student=manager.find(Student.class, id);
			
			student.setPhoneno(number);
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(student);
			transaction.commit();
			
			//System.out.println(employee.getDesignation());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}

	@Override
	public void updateStandard(int id,String standard) {
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			Student student=manager.find(Student.class, id);
			
			student.setStandard(standard);
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(student);
			transaction.commit();
			
			//System.out.println(employee.getDesignation());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}

	@Override
	public void updateId(int id,int newId) {
		
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			Student student=manager.find(Student.class, id);
			String name=student.getName();
			String standard=student.getStandard();
			int phoneNo=student.getPhoneno();
			
			Student student1 = new Student();
			student1.setName(name);
			student1.setRollno(newId);
			student1.setPhoneno(phoneNo);
			student1.setStandard(standard);
			
			
			transaction=manager.getTransaction();
			transaction.begin();
			
			manager.persist(student1);
			manager.remove(student);
			transaction.commit();
			
			
			//System.out.println(employee.getDesignation());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}
	
	

	@Override
	public void deleteStudent(int id) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		//Employee employee=new Employee();
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			Student student=manager.getReference(Student.class, id);
			transaction.begin();
			manager.remove(student);
			transaction.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			factory.close();
			manager.close();
		}

	}

}
