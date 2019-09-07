package com.skilldistillery.tkd.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.tkd.entities.TKD;

public class TKDClient {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TKDPU");

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		TKD tkd = em.find(TKD.class, 1);
		System.out.println(tkd);
		em.close();
		emf.close();

	}
}
