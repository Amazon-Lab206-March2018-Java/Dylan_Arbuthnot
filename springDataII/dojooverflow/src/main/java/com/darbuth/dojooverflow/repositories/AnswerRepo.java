package com.darbuth.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darbuth.dojooverflow.models.Answer;
import com.darbuth.dojooverflow.models.Question;

@Repository
public interface AnswerRepo extends CrudRepository<Answer, Long> {

	List<Answer> findAll();
}
