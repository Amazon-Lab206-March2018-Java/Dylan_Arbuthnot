package com.darbuth.waterbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.waterbnb.models.Review;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Long> {

	List<Review> findAll();
}
