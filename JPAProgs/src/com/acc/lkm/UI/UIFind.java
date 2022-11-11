package com.acc.lkm.UI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.empentity.EmpEntity;

public class UIFind {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPAProgs");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=entityManager.find(EmpEntity.class,1);
		if(emp!=null) {
			System.out.println("Employee ID is: "+emp.getEmpid()+"\n"+
		    "Employee Name is :"+emp.getEmpname()+"\n"+
					"Employee Role is "+emp.getRole()+"\n"+
		              "Employee Hire Date is:"+emp.getHiredate()+"\n"+
					  "Employee Salary is:"+emp.getSalary()
					
					);
		}
		else {
			System.out.println("Employee not found");
		}
		entityManager.close();
		entityManagerFactory.close();

	}

}
