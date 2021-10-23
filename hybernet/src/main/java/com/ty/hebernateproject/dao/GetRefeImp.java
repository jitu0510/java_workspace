package com.ty.hebernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hybernetproject.Employee;

public class GetRefeImp {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		Employee employee = manager.getReference(Employee.class, 100);
		System.out.println(employee);
	}
}
