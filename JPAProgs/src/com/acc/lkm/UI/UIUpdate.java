package com.acc.lkm.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.empentity.EmpEntity;

public class UIUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPAProgs");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=entityManager.find(EmpEntity.class,1);
		if(emp!=null) {
			entityManager.getTransaction().begin();
			emp.setSalary(15000.0);
			entityManager.getTransaction().commit();
			System.out.println("Employee details updated");
			
		}
		else {
			System.out.println("Employee not found");
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
