package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import com.skilldistillery.tkd.entities.TKD;

public interface TKDDAO {
	public TKD findByTech(String technique);
	public TKD findByBelt(String belt);
}
