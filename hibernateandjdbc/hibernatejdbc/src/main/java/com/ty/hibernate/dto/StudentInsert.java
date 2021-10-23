package com.ty.hibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentInsert {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setRollno(1);
		student1.setName("jitu");
		student1.setPhoneno(99999999);
		student1.setStandard("12th");
		Student student2 = new Student();
		student2.setRollno(2);
		student2.setName("kumar");
		student2.setPhoneno(99999998);
		student2.setStandard("10th");
		Student student3 = new Student();
		student3.setRollno(3);
		student3.setName("mandal");
		student3.setPhoneno(989999999);
		student3.setStandard("11th");
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("student");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(student1);
			manager.persist(student2);
			manager.persist(student3);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}finally {
			if(factory!=null)
				factory.close();
			if(manager!=null)
				manager.close();
		}


	}

}
