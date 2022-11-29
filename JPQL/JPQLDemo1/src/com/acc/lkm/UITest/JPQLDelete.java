package com.acc.lkm.UITest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createQuery("DELETE from StudentEntity  where STUDENT_ID=2");
		query.executeUpdate();
		System.out.println("Deleted");
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
