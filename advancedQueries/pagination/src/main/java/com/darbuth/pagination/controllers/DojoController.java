package com.darbuth.pagination.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.darbuth.pagination.services.ApiService;

@Controller
public class DojoController {

	@Autowired
	ApiService as;
	
	@RequestMapping("/")
	public String index() {
		System.out.println("hello");
		return "index.jsp";
	}
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model,
			@PathVariable("pageNumber") int pageNumber) {
	    Page<Object[]> ninjas = as.dojoNinjasPerPage(pageNumber - 1);
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("ninjas", ninjas);
	    for (Object[] row : ninjas) {
	    	System.out.println(row);
	    }
	    return "index.jsp";
	}

}
