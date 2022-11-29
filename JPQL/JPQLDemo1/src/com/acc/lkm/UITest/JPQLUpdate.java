package com.acc.lkm.UITest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("UPDATE StudentEntity SET STREAM='C' where STUDENT_ID=2");
		//Query query=em.createNamedQuery("update");
		query.executeUpdate();
		System.out.println("Updated");
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
