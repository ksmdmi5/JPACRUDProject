package com.skilldistillery.tkd.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.tkd.entities.TKD;

public class TKDDAOImpl implements TKDDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TKDDB");
	private static EntityManager em = emf.createEntityManager();
	
	@Override
	public TKD create(TKD tkd) {
		em.getTransaction().begin();
		em.persist(tkd);
		em.flush();
		em.getTransaction().commit();
		em.close();
		return null;
	}

	@Override
	public TKD update(int id, TKD tkd) {
		em.getTransaction().begin();
		TKD managedTKD = em.find(TKD.class, id);
		managedTKD.setTechnique(tkd.getTechnique());
		managedTKD.setType(tkd.getType());
		managedTKD.setDescription(tkd.getDescription());
		managedTKD.setBelt(tkd.getBelt());
		em.flush();
		em.getTransaction().commit();
		em.close();
		return managedTKD;
	}

	@Override
	public boolean destroy(int id) {
		TKD tkd = em.find(TKD.class, id);
		em.getTransaction().begin();
		em.remove(tkd);
		em.getTransaction().commit();
		System.out.println(tkd);
		em.close();
		return true;
	}

}
