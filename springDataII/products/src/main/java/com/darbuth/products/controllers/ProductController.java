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
public class ProductController {

	@Autowired
	private final ProductService ps;
	
	@Autowired
	private final CategoryService cs;
	
	public ProductController(ProductService ps,
			CategoryService cs) {
		this.ps = ps;
		this.cs = cs;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("products", ps.allProducts());
		model.addAttribute("categories", cs.allCategories());
		return "index.jsp";
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product prod) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/products/create")
	public String createProduct(@Valid @ModelAttribute("product") Product prod,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newProduct.jsp";
		}
		ps.createProduct(prod);
		return "redirect:/";
	}
	
	@RequestMapping("/products/show/{id}")
	public String showProduct(@PathVariable("id") Long id,
			Model model) {
		Product prod = ps.findById(id);
		model.addAttribute("product", prod);
		model.addAttribute("categories", cs.allCategories());
		return "showProduct.jsp";
	}
	
	@PostMapping("/products/{id}/addCategory")
	public String updateCategory(@PathVariable("id") Long id,
			@RequestParam("categories") Long cat_id) {
		Category cat = cs.findById(cat_id);
		Product prod = ps.findById(id);
		ps.updateCategories(prod, cat);
		return "redirect:/";
	}
}
