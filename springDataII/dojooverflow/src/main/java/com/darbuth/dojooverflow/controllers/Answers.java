package com.darbuth.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darbuth.dojooverflow.models.Answer;
import com.darbuth.dojooverflow.services.AnswerService;
import com.darbuth.dojooverflow.services.QuestionService;

@Controller
public class Answers {
	
	@Autowired
	private final AnswerService as;
	private final QuestionService qs;
	public Answers(AnswerService as,
			QuestionService qs) {
		this.as = as;
		this.qs = qs;
	}
	
	@PostMapping("/answers/create")
	public String createAnswer(@Valid @ModelAttribute("ans") Answer ans,
			BindingResult result,
			@RequestParam("question") Long q_id,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("question", qs.findById(q_id));
			return "show.jsp";
		}
		ans.setQuestion(qs.findById(q_id));
		as.createAnswer(ans);
		return "redirect:/questions/show/" + q_id;
	}
}
