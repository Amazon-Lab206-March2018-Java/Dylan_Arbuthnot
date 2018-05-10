package com.darbuth.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.products.models.Category;
import com.darbuth.products.models.Product;
import com.darbuth.products.repositories.ProductRepo;

@Service
public class ProductService {

	private final ProductRepo pr;
	public ProductService(ProductRepo pr) {
		this.pr = pr;
	}
	
	public List<Product> allProducts() {
		return pr.findAll();
	}
	
	public Product createProduct(Product prod) {
		return pr.save(prod);
	}
	
	public Product findById(Long id) {
		Optional<Product> product = pr.findById(id);
		if (product != null) {
			return product.get();
		}
		return null;
	}
	
	public void updateCategories(Product prod, Category cat) {
		prod.updateCategories(cat);
		pr.save(prod);
	}
}
