package com.acc.lkm.UI;
import java.util.Date;

import javax.persistence.*;

import com.acc.lkm.empentity.EmpEntity;
public class UIMerge {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPAProgs");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=new EmpEntity();
		emp.setEmpname("Aman Rathore");
		emp.setRole("Developer");
		emp.setSalary(90000.00);
		emp.setHiredate(new Date());
		entityManager.getTransaction().begin();
		entityManager.merge(emp);
		entityManager.getTransaction().commit();
		System.out.println("Employee Registered successfully");
		entityManager.close();
		entityManagerFactory.close();
		
		

	}

}
