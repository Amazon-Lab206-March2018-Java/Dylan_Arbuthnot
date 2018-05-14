package com.darbuth.pagination.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.darbuth.pagination.models.Dojo;
import com.darbuth.pagination.models.Ninja;
import com.darbuth.pagination.repositories.DojoRepo;
import com.darbuth.pagination.repositories.NinjaRepo;

@Service
@Transactional
public class ApiService {

    @Autowired 
    NinjaRepo nr;
    DojoRepo dr;
    
    private static final int PAGE_SIZE = 2;
    
    public Page<Ninja> ninjasPerPage(int pageNumber) {
        PageRequest pageRequest = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "dojo");
        return nr.findAllNinjas(pageRequest);
    }
    
    public Page<Object[]> dojoNinjasPerPage(int pageNum) {
    	PageRequest pageRequest = new PageRequest(pageNum, PAGE_SIZE, Sort.Direction.ASC, "dojo");
    	return nr.findNinjasByDojo(pageRequest);
    }
	
}
