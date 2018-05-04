package com.darbuth.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LearningPlatformController {

	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
	public String lesson(@PathVariable String chapter,
			@PathVariable String lessonNumber,
			Model model) {
		model.addAttribute("chapter", chapter);
		if (Integer.valueOf(chapter) == 38) {
			model.addAttribute("topic", "Fortran");
			if (Integer.valueOf(lessonNumber) == 733) {
				model.addAttribute("content", "Setting up your servers");
			} else if (Integer.valueOf(lessonNumber) == 342) {
				model.addAttribute("content", "Punch cards");
			}
		} else if (Integer.valueOf(chapter) == 26) {
			model.addAttribute("topic", "Advanced Fortran");
			if (Integer.valueOf(lessonNumber) == 348) {
				model.addAttribute("content", "Advanced Fortran Intro");
			}
		}
		return "lesson.jsp";
	}
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(@PathVariable String chapter,
			@PathVariable String assignmentNumber,
			Model model) {
		model.addAttribute("chapter", chapter);
		if (Integer.valueOf(chapter) == 38) {
			model.addAttribute("topic", "Fortran");
			if (Integer.valueOf(assignmentNumber) == 345) {
				model.addAttribute("content", "Coding Forms");
			}
		} else if (Integer.valueOf(chapter) == 26) {
			model.addAttribute("topic", "Advanced Fortran");
			if (Integer.valueOf(assignmentNumber) == 2342) {
				model.addAttribute("content", "Fortran to Binary");
			}
		}
		return "assignment.jsp";
	}
}