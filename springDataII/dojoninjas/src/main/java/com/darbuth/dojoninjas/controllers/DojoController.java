package com.darbuth.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.dojoninjas.models.Dojo;
import com.darbuth.dojoninjas.services.DojoService;

@Controller
public class DojoController {
	
	private final DojoService ds;
	public DojoController(DojoService ds) {
		this.ds = ds;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Dojo> dojos = ds.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		ds.createDojo(dojo);
		return "redirect:/";
	}

}
