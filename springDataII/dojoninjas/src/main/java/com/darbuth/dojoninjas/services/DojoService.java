package com.darbuth.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darbuth.dojoninjas.models.Dojo;
import com.darbuth.dojoninjas.repositories.DojoRepo;

@Service
public class DojoService {
	
	private final DojoRepo dr;
	public DojoService(DojoRepo dr) {
		this.dr = dr;
	}
	
	public void createDojo(Dojo dojo) {
		dr.save(dojo);
	}
	
	public List<Dojo> allDojos() {
		return dr.findAll();
	}
	
}
