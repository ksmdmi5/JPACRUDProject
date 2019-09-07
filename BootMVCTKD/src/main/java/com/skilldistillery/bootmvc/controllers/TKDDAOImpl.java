package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.tkd.entities.TKD;

@Transactional
@Service
public class TKDDAOImpl implements TKDDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public TKD findByTech(String technique) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TKD findByBelt(String belt) {
		return em.find(TKD.class, belt);
	}

}
