package com.darbuth.products.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darbuth.products.models.Category;
import com.darbuth.products.models.Product;
import com.darbuth.products.services.CategoryService;
import com.darbuth.products.services.ProductService;

@Controller
public class CategoryController {
		
	@Autowired
	private final CategoryService cs;
	
	private final ProductService ps;
	
	public CategoryController(ProductService ps,
			CategoryService cs) {
		this.ps = ps;
		this.cs = cs;
	}
	
	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category cat) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/create")
	public String createCategory(@Valid @ModelAttribute("category") Category cat,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newCategory.jsp";
		}
		cs.createCategory(cat);
		return "redirect:/";
	}
	
	@RequestMapping("/categories/show/{id}")
	public String showCategory(@PathVariable("id") Long id,
			Model model) {
		Category cat = cs.findById(id);
		if (cat != null) {
			model.addAttribute("category", cat);
			model.addAttribute("products", ps.allProducts());
			return "showCategory.jsp";
		}
		 return "redirect:/";
	}
	
	@PostMapping("/categories/{id}/addProduct")
	public String updateProducts(@PathVariable("id") Long id,
			@RequestParam("products") Long prod_id) {
		Product prod = ps.findById(prod_id);
		Category cat = cs.findById(id);
		cs.updateProducts(cat, prod);
		return "redirect:/";
	}
}
