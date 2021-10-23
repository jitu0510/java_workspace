package com.ty.hebernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hybernetproject.Employee;

public class UpdateUsinjql {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String update = "update Employee set name = 'sumeet' where id = 100";
		Query query = manager.createQuery(update);
		int result = query.executeUpdate();
		transaction.commit();
		
		
	}
}
