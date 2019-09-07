package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.tkd.entities.TKD;

@Controller
public class TKDController {

	@Autowired
	private TKDDAO dao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
//		List<TKD> tkd = dao.findAll();
//		model.addAttribute("tkd", tkd);
		return "index"; // if using a ViewResolver.
	}

	@RequestMapping(path = "getBelt.do")
	public String showFilm(@RequestParam("belt") String belt, Model model) {
		TKD tkd = dao.findByBelt(belt);
		model.addAttribute("tkd", tkd);
//        return "WEB-INF/film/show.jsp";
		return "tkd/show";
	}
}
