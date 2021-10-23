package com.ty.hebernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hybernetproject.Employee;

public class FindById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		String findAll = "from Employee where eid=100";
		Query query = manager.createQuery(findAll);
		Employee employee = (Employee) query.getSingleResult();
		System.out.println(employee);
		System.out.println("==================================");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}
}
