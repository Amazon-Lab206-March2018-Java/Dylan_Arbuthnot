package com.darbuth.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.dojooverflow.models.Question;
import com.darbuth.dojooverflow.models.Tag;
import com.darbuth.dojooverflow.repositories.QuestionRepo;

@Service
public class QuestionService {

	private final QuestionRepo qr;
	public QuestionService(QuestionRepo qr) {
		this.qr = qr;
	}
	
	public List<Question> allQuestions() {
		return qr.findAll();
	}
	
	public Question createQuestion(Question q) {
		return qr.save(q);
	}
	
	public Question findById(Long id) {
		Optional<Question> q = qr.findById(id);
		if (q != null) {
			return q.get();
		}
		return null;
	}
}
