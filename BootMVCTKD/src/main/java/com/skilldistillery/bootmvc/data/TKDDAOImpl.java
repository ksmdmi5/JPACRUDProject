package com.skilldistillery.bootmvc.data;

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
	public TKD findById(int id) {
		return em.find(TKD.class, id);
	}
	@Override
	public TKD findByTech(String technique) {
		return em.find(TKD.class, technique);
	}

	@Override
	public List<TKD> findByBelt(String belt) {
		String query = "SELECT tkd FROM TKD tkd WHERE belt "
				+ "LIKE CONCAT('%',:belt,'%') ORDER BY belt";
		List<TKD> belts = (List<TKD>) em.createQuery(query, TKD.class)
										 .setParameter("belt", belt)
										 .getResultList();
		System.out.println(belts);
 		return belts;
	}
	
	@Override
	public List<TKD> findByType(String type) {
		String query = "SELECT tkd FROM TKD tkd WHERE type "
				+ "LIKE CONCAT ('%',:type,'%') ORDER BY type";
		List<TKD> types = (List<TKD>) em.createQuery(query, TKD.class)
										.setParameter("type", type)
										.getResultList();
		return types;
	}

	@Override
	public List<TKD> findByKeyword(String keyword) {
		String query = "SELECT tkd FROM TKD tkd WHERE technique "
				+ "LIKE CONCAT ('%',:keyword,'%')";
		List<TKD> techs = (List<TKD>) em.createQuery(query, TKD.class)
										.setParameter("keyword", keyword)	
										.getResultList();
		return techs;
	}

	@Override
	public TKD addTKD(TKD tkd) {
		System.out.println(tkd.toString());
		em.persist(tkd);
		em.flush();
		em.close();
		return tkd;
	}

	@Override
	public TKD editTKD(int id, TKD tkd) {
		TKD managedTkd = em.find(TKD.class, id);
		managedTkd.setTechnique(tkd.getTechnique());
		managedTkd.setDescription(tkd.getDescription());
		managedTkd.setType(tkd.getType());
		managedTkd.setBelt(tkd.getBelt());
		em.persist(managedTkd);
		em.flush();
		return managedTkd;
	}

	@Override
	public boolean deleteTKD(int id, TKD tkd) {
		try {
			em.remove(tkd);
		} catch (Exception e) {
			return false;
		}
		em.close();
		return true;
	}

	@Override
	public boolean tkdExists(String technique) {
		String query = "SELECT tkd FROM TKD tkd";
		List<TKD> tkd = em.createQuery(query, TKD.class).getResultList();
		if (tkd.contains(technique)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<TKD> findAll() {
		String query = "SELECT technique FROM TKD technique " + "ORDER BY id";
		List<TKD> tech = em.createQuery(query, TKD.class).getResultList();
		return tech;
	}

}
