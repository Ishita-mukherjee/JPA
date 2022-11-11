package com.acc.lkm.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.empentity.EmpEntity;

public class UIDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPAProgs");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=entityManager.find(EmpEntity.class,2);
		if(emp!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.remove(emp);
			entityManager.getTransaction().commit();
			System.out.println("Employee details deleted");
		}
		else {
			System.out.println("Employee not found");
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
