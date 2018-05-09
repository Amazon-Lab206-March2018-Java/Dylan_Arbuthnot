package com.darbuth.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.dojoninjas.models.Ninja;
import com.darbuth.dojoninjas.services.DojoService;
import com.darbuth.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private final NinjaService ns;
	
	@Autowired
	private final DojoService ds;
	
	public NinjaController(NinjaService ns, DojoService ds) {
		this.ns = ns;
		this.ds = ds;
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja,
			Model model) {
		model.addAttribute("dojos", ds.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newNinja.jsp";
		}
		ns.createNinja(ninja);
		return "redirect:/";
	}
}
