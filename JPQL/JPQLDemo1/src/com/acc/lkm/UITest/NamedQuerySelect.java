package com.acc.lkm.UITest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.acc.lkm.entity.StudentEntity;

public class NamedQuerySelect {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("fetch");
		List<StudentEntity>list=query.getResultList();//get all entities to List
		System.out.println("========Student List===========");
		System.out.print("Student ID");
		System.out.print("Student Name");
		System.out.print("Age");
		System.out.println("Stream");
		
		//Read/fetch the records of students from List
		for(StudentEntity s1:list) {
			System.out.println(s1.getStudent_id()+" "+s1.getStudent_name()+" "+s1.getStudent_age()+" "+s1.getStream());
		}
		
		

	}

}
