package com.darbuth.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darbuth.dojooverflow.models.Answer;
import com.darbuth.dojooverflow.models.Question;
import com.darbuth.dojooverflow.models.Tag;
import com.darbuth.dojooverflow.services.QuestionService;
import com.darbuth.dojooverflow.services.TagService;

@Controller
public class Questions {
	
	@Autowired
	private final QuestionService qs;
	private final TagService ts;
	
	public Questions(QuestionService qs,
			TagService ts) {
		this.qs = qs;
		this.ts = ts;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("questions", qs.allQuestions());
		return "index.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("q") Question q) {
		return "new.jsp";
	}
	
	@PostMapping("/questions/create")
	public String createQuestion(@Valid @ModelAttribute("q") Question q,
			BindingResult result,
			@RequestParam("tag1") String tag1,
			@RequestParam("tag2") String tag2,
			@RequestParam("tag3") String tag3) {
		if (result.hasErrors()) {
			return "new.jsp";
		}
		Question question = qs.createQuestion(q);
		List<String> tag_list = new ArrayList<String>(Arrays.asList(tag1, tag2, tag3));
		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < tag_list.size(); i++) {
			if (ts.findTagBySubject(tag_list.get(i)) != null) {
				tags.add(ts.findTagBySubject(tag_list.get(i)));
			}
		}
		question.setTags(tags);
		qs.createQuestion(question);
		return "redirect:/questions/show/" + question.getId();
	}

	@RequestMapping("/questions/show/{id}")
	public String showQuestion(@ModelAttribute("ans") Answer ans,
			@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("question", qs.findById(id));
		return "show.jsp";
	}
}
