package dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.Dao;

public class Dto {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(Dao d)
	{
		entityTransaction.begin();
		entityManager.persist(d);
		entityTransaction.commit();
		
	}
	public void update(Dao d)
	{

		entityTransaction.begin();
		entityManager.merge(d);
		entityTransaction.commit();
			
	}

}
