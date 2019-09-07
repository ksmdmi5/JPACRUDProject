package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.bootmvc.data.TKDDAO;
import com.skilldistillery.tkd.entities.TKD;

@Controller
public class TKDController {

	@Autowired
	private TKDDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
//		List<TKD> tkd = dao.findAll();
//		model.addAttribute("tkd", tkd);
		return "index"; // if using a ViewResolver.
	}

	@RequestMapping(path = "addTKD.do", method = RequestMethod.GET)
	public ModelAndView addTech() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tkd/addTKD");
		return mv;
	}

	@RequestMapping(path = "addTKD.do", method = RequestMethod.POST)
	public ModelAndView addNewTKD(TKD tkd) {
		TKD newTkd = dao.addTKD(tkd);
		ModelAndView mv = new ModelAndView();
		mv.addObject("tkd", newTkd);
		mv.setViewName("tkd/show");
		return mv;
	}

	@RequestMapping(path = "editTKD.do", method = RequestMethod.GET)
	public ModelAndView updateTKD(@RequestParam("id") int id, Model model) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("tkd", dao.findById(id));
		mv.setViewName("tkd/editTKD");
		return mv;
	}
	@RequestMapping(path = "editTKD.do", method = RequestMethod.POST)
	public ModelAndView editNewTKD(TKD tkd) {
		TKD updatedTKD = dao.editTKD(tkd.getId(), tkd);
		ModelAndView mv = new ModelAndView();
		mv.addObject("tkd", updatedTKD);
		mv.setViewName("tkd/show");
		return mv;
	}
	@RequestMapping(path = "deleteTKD.do")
	public  ModelAndView deleteTKD(@RequestParam("id") int id, Model model) {
	ModelAndView mv = new ModelAndView();
	TKD tkd = dao.findById(id);
	System.out.println(tkd);
	boolean isDeleted = dao.deleteTKD(id, tkd);
	if (isDeleted) {
		mv.setViewName("tkd/deletedTKD");
	} else {
		mv.setViewName("tkd/error");
	}
	return mv;
	}
	@RequestMapping(path = "showAll.do")
	public String showAll(Model model) {
		List<TKD> tkd = dao.findAll();
		model.addAttribute("tkd", tkd);
		return "tkd/showAll";
	}
	@RequestMapping(path = "searchBelt.do")
	public String searchBelt(@RequestParam("belt") String belt, Model model) {
		List<TKD> tkd = dao.findByBelt(belt);
		model.addAttribute("tkd", tkd);
//        return "WEB-INF/film/show.jsp";
		return "tkd/show";
	}
	@RequestMapping(path="searchType.do", method = RequestMethod.GET)
	public String searchType(@RequestParam("type") String type, Model model) {
		List<TKD> tkd = dao.findByType(type);
		model.addAttribute("tkd", tkd);
		return "tkd/show";
	}
	@RequestMapping(path="searchKeyword.do", method = RequestMethod.GET)
	public String searchKeyword(@RequestParam("keyword") String keyword, Model model) {
		List<TKD> tkd = dao.findByKeyword(keyword);
		model.addAttribute("tkd", tkd);
		return "tkd/show";
	}
	@RequestMapping(path="searchTech.do", method = RequestMethod.GET)
	public String searchTech(@RequestParam("technique") String technique, Model model) {
		List<TKD> tkd = dao.findByTech(technique);
		model.addAttribute("tkd", tkd);
		return "tkd/show";
	}
	@RequestMapping(path = "getTKD.do")
	public String showTKD(@RequestParam("id") int id, Model model) {
		TKD tkd = dao.findById(id);
		model.addAttribute("tkd", tkd);
		return "tkd/show";
	}
}	
