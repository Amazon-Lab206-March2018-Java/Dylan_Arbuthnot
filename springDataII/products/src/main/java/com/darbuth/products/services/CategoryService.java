package com.darbuth.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.products.models.Category;
import com.darbuth.products.models.Product;
import com.darbuth.products.repositories.CategoryRepo;

@Service
public class CategoryService {
	
	private final CategoryRepo cr;
	public CategoryService(CategoryRepo cr) {
		this.cr = cr;
	}
	
	public List<Category> allCategories() {
		return cr.findAll();
	}
	
	public Category createCategory(Category cat) {
		return cr.save(cat);
	}
	
	public Category findById(Long id) {
		Optional<Category> cat = cr.findById(id);
		if (cat != null) {
			return cat.get();
		}
		return null;
	}
	
	public void updateProducts(Category cat, Product prod) {
		cat.updateProducts(prod);
		cr.save(cat);
	}
}
