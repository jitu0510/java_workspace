package com.ty.hebernateproject.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hybernetproject.Employee;

public class DynamicUpdateUsingJpql {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employye name & designation and id to find details :");
		String name = scanner.next();
		System.out.println("Enter employye designation");
		String degi = scanner.next();
		System.out.println("Enter employye id");
		int id = scanner.nextInt();
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			String dynamic = "update Employee set ename = :name , edesg = :deg where eid = :id";
			
			Query query = manager.createQuery(dynamic);
			query.setParameter("name", name);
			query.setParameter("deg", degi);
			query.setParameter("id", id );
			query.executeUpdate();
			//query.setParameter("id", value);
//			Employee employee = (Employee) query.getSingleResult();
//			System.out.println(employee);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (factory!=null) {
				factory.close();

			}
			if (manager!=null) {
				manager.close();
			}
			
		}

	}
}
