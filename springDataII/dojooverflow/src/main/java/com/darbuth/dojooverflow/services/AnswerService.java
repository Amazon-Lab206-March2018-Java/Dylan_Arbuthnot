package com.darbuth.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darbuth.dojooverflow.models.Answer;
import com.darbuth.dojooverflow.models.Question;
import com.darbuth.dojooverflow.repositories.AnswerRepo;

@Service
public class AnswerService {

	private final AnswerRepo ar;
	public AnswerService(AnswerRepo ar) {
		this.ar = ar;
	}
	
	public List<Answer> allAnswers() {
		return ar.findAll();
	}
	
	public Answer createAnswer(Answer ans) {
		return ar.save(ans);
	}
}
