package com.ty.hebernateproject.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hybernetproject.Employee;

public class CommandLineArgsJpql {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employye id to find details :");
		int value = scanner.nextInt();
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			String dynamic = "from Employee where id = :id";
			
			Query query = manager.createQuery(dynamic);
			//query.setParameter("i", Integer.parseInt(args[0]));
			query.setParameter("id", value);
			Employee employee = (Employee) query.getSingleResult();
			System.out.println(employee);
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
