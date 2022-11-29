package com.acc.lkm.UITest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueryDelete {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("delete");
		query.executeUpdate();
		System.out.println("Deleted");
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
