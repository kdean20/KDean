package com.homeplace.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homeplace.entity.Contractors;
import com.homeplace.entity.Services;
import com.homeplace.service.ContractorsService;

@Controller
public class ContractorsController {

	@Autowired
	ContractorsService contractorsService;

//	@GetMapping("/list-plumbers")
//	public ModelAndView login(Model model) {
//		return new ModelAndView("list-plumbers", "contractors", new Contractors());
//	}

//	@PostMapping("/list-plumbers")
//	public String listPlumbers(Model model, Contractors contractors, Services services) {
//		List<Contractors> plumbersList = contractorsService.listPlumbersById(contractors.getCity(), contractors.getState(), services.getServiceName());
//		model.addAttribute("plumberList", plumbersList);
//		return "plumber-results";
//	}
	
	@PostMapping("/home")
	public String listPlumbers(Model model, Contractors contractors) {
		List<Contractors> plumbersList = contractorsService.listPlumbersByCityAndState(contractors.getCity(), contractors.getState(),(4));
		model.addAttribute("plumberList", plumbersList);
		return "plumber-results";
	}

	@PostMapping("/list-all")
	public String listAllContractors(Model model) {
		List<Contractors> contractorsList = contractorsService.listAll();
		model.addAttribute("contractorList", contractorsList);
		return "list-all";
	}

//	@PostMapping("/list-landscapers")
//	public String listLandscapers(Model model, int serviceId) {
//		List<Contractors> landscapersList = contractorsService.listLandscapersById(serviceId);
//		model.addAttribute("landscaperList", landscapersList);
//		return "list-landscapers";
//	}
//
//	@PostMapping("/list-painters")
//	public String listPainters(Model model, int serviceId) {
//		List<Contractors> paintersList = contractorsService.listPaintersById(serviceId);
//		model.addAttribute("painterList", paintersList);
//		return "list-painters";
//	}
//
//	@PostMapping("/list-carpenters")
//	public String listCarpenters(Model model, int serviceId) {
//		List<Contractors> carpentersList = contractorsService.listCarpentersById(serviceId);
//		model.addAttribute("carpenterList", carpentersList);
//		return "list-carpenters";
//	}

}
