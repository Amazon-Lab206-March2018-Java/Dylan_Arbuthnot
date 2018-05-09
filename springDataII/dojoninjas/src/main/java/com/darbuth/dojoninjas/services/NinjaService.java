package com.darbuth.dojoninjas.services;

import org.springframework.stereotype.Service;

import com.darbuth.dojoninjas.models.Ninja;
import com.darbuth.dojoninjas.repositories.NinjaRepo;

@Service
public class NinjaService {

	private final NinjaRepo nr;
	public NinjaService(NinjaRepo nr) {
		this.nr = nr;
	}
	
	public void createNinja(Ninja ninja) {
		nr.save(ninja);
	}
	
}
