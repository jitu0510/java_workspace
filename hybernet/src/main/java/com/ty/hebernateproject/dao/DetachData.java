package com.ty.hebernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hybernetproject.Employee;

public class DetachData {
	public static void main(String[] args) {
//		Employee employee = new Employee();
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		
		
		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			Employee employee = manager.find(Employee.class, 100);
			transaction = manager.getTransaction();
			//manager.detach(employee);
			
			
			employee.setName("Mohan");;
			transaction.begin();
			manager.merge(employee);
			//manager.remove(employee);
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
