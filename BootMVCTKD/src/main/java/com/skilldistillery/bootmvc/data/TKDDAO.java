package com.skilldistillery.bootmvc.data;

import java.util.List;

import com.skilldistillery.tkd.entities.TKD;

public interface TKDDAO {
	public List<TKD> findByTech(String technique);
	public List<TKD> findAll();
	public List<TKD> findByBelt(String belt);
	public List<TKD> findByType(String type);
	public List<TKD> findByKeyword(String keyword);
	public TKD addTKD(TKD tkd);
	public TKD editTKD(int id, TKD tkd);
	public boolean deleteTKD(int id, TKD tkd);
	public boolean tkdExists(String technique);
	public TKD findById(int id);
}
