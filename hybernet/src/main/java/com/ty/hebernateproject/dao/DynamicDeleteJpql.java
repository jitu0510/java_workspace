package com.ty.hebernateproject.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteJpql {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employye id");
		int id = scanner.nextInt();

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			String dynamic = "delete from Employee where id = :id";
			Query query = manager.createQuery(dynamic);
			// query.setParameter("name", args[0]);
			// query.setParameter("deg", args[1]);
			// query.setParameter("id", Integer.parseInt(args[0]));
			query.setParameter("id", id);
			int result = query.executeUpdate();

			// Employee employee = (Employee) query.getSingleResult();
			// System.out.println(employee);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (factory != null) {
				factory.close();

			}
			if (manager != null) {
				manager.close();
			}

		}

	}
}
