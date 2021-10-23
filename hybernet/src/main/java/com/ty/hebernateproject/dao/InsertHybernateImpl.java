package com.ty.hebernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hybernetproject.Employee;

public class InsertHybernateImpl {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(300);
		employee.setName("mukul");
		employee.setSalary(50000);
		employee.setDesignation("Developer");
		EntityTransaction transaction = null;	
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();;
			}
		}
		finally {
			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
			
		}
		
	}
}
