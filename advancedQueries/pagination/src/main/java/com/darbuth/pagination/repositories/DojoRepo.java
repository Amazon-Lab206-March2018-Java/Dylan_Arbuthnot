package com.darbuth.pagination.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.darbuth.pagination.models.Dojo;

public interface DojoRepo extends PagingAndSortingRepository<Dojo, Long> {
	
	@Query("SELECT d FROM Dojo d")
	Page<Dojo> dojoNinjas(Pageable pageable);
}
