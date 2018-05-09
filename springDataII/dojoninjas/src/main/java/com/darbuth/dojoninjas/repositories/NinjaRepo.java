package com.darbuth.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.dojoninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
