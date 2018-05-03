package com.darbuth.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(HttpSession session) {
		if (session.isNew()) {
			session.setAttribute("gold", 0);
			session.setAttribute("log", new ArrayList<AbstractMap.SimpleEntry<String, String>>());
		}
		if ((Integer) session.getAttribute("gold") < -50) {
			return "redirect:/jail";
		}
		return "index.jsp";
	}
	
//	@RequestMapping(path = "/building", method = RequestMethod.POST)
//	public String building(@RequestParam(value = "building") String building, HttpSession session, Model model) {
//		Random r = new Random();
//		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
//		model.addAttribute("building", building);
//		Integer gold = (Integer) session.getAttribute("gold");
//		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
//		if (model.asMap().containsValue("farm")) {
//			Integer loot = r.nextInt(10) + 10;
//			session.setAttribute("gold", gold + loot);
//			AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
//					"You found " + loot + " gold by stealing from the farm. Hopefully they don't notice. " + timestamp);
//			log.add(0, activity);
//		} else if (model.asMap().containsValue("cave")) {
//			Integer loot = r.nextInt(5) + 5;
//			session.setAttribute("gold", gold + loot);
//			AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
//					"You have earned " + loot + " gold from exploring the damp, dark cave. " + timestamp);
//			log.add(0, activity);
//		} else if (model.asMap().containsValue("house")) {
//			Integer loot = r.nextInt(3) + 2;
//			ArrayList<String> log_list = (ArrayList)session.getAttribute("log");
//			session.setAttribute("gold", gold + loot);
//			AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
//					"You took " + loot + " gold from the house. It's good that the family wasn't home. " + timestamp);
//			log.add(0, activity);
//		} else if (model.asMap().containsValue("casino")) {
//			Integer chance = r.nextInt(10);
//			Integer loot = r.nextInt(50);
//			if (chance % 2 == 0) {
//				session.setAttribute("gold", gold + loot);
//				AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
//						"You took a chance and won " + loot + " gold from the casino. Congrats. " + timestamp);
//				log.add(0, activity);
//			} else {
//				session.setAttribute("gold", gold - loot);
//				AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("red",
//						"You took a chance, but it didn't pay off. You lost " + loot + " gold from the casino. " + timestamp);
//				log.add(0, activity);
//			}
//		}
//		return "redirect:/";
//	}
	
	@RequestMapping(path = "/farm", method = RequestMethod.POST)
	public String farm(HttpSession session) {
		Random r = new Random();
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		Integer loot = r.nextInt(10) + 10;
		session.setAttribute("gold", gold + loot);
		AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
				"You found " + loot + " gold by stealing from the farm. Hopefully they don't notice. " + timestamp);
		log.add(0, activity);
		return "redirect:/";
	}
	@RequestMapping(path = "/cave", method = RequestMethod.POST)
	public String cave(HttpSession session) {
		Random r = new Random();
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		Integer loot = r.nextInt(5) + 5;
		session.setAttribute("gold", gold + loot);
		AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
				"You have earned " + loot + " gold from exploring the damp, dark cave. " + timestamp);
		log.add(0, activity);
		return "redirect:/";
	}
	@RequestMapping(path = "/house", method = RequestMethod.POST)
	public String house(HttpSession session) {
		Random r = new Random();
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		Integer loot = r.nextInt(3) + 2;
		session.setAttribute("gold", gold + loot);
		AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
				"You took " + loot + " gold from the house. It's good that the family wasn't home. " + timestamp);
		log.add(0, activity);
		return "redirect:/";
	}
	@RequestMapping(path = "/casino", method = RequestMethod.POST)
	public String casino(HttpSession session) {
		Random r = new Random();
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		Integer chance = r.nextInt(10);
		Integer loot = r.nextInt(50);
		if (chance % 2 == 0) {
			session.setAttribute("gold", gold + loot);
			AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("green",
					"You took a chance and won " + loot + " gold from the casino. Congrats. " + timestamp);
			log.add(0, activity);
		} else {
			session.setAttribute("gold", gold - loot);
			AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("red",
					"You took a chance, but it didn't pay off. You lost " + loot + " gold from the casino. " + timestamp);
			log.add(0, activity);
		}
		return "redirect:/";
	}
	@RequestMapping(path = "/spa" , method = RequestMethod.POST)
	public String spa(HttpSession session) {
		Random r = new Random();
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		Integer loot = r.nextInt(15) + 5;
		session.setAttribute("gold", gold - loot);
		AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("blue",
				"You needed a break. Spent a nice day at the spa. It cost " + loot + " gold. " + timestamp);
		log.add(0, activity);
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/jail")
	public String jail(HttpSession session) {
		String timestamp = new SimpleDateFormat("'('MMMM d yyyy hh:mm a')'").format(new Date());
		ArrayList<AbstractMap.SimpleEntry<String, String>> log = (ArrayList<AbstractMap.SimpleEntry<String, String>>) session.getAttribute("log");
		AbstractMap.SimpleEntry<String, String> activity = new AbstractMap.SimpleEntry<String, String>("orange",
				"You had too many delinquent loans and have been taken to debtor's jail. " + timestamp);
		log.add(0, activity);
		return "jail.jsp";
	}
}
