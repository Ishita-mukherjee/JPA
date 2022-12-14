package com.acc.lkm.utility;

import javax.persistence.*;

public class JPAUtility {

	private static EntityManagerFactory entityManagerFactory;
	
		
    private static EntityManagerFactory buildEntityManagerFactory() {
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("JPAOnetoOne");
        	
        	return entityManagerFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initialization of EntityManagerFactory failed." + ex);
            throw new RuntimeException(ex);
        }
    }

    
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory == null) entityManagerFactory = buildEntityManagerFactory();
        return entityManagerFactory;
    }
	
	public static void closeEntityManagerFactory(){
		
		if(entityManagerFactory != null && entityManagerFactory.isOpen()==true ) entityManagerFactory.close();
	}
	
}
