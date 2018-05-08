package com.darbuth.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darbuth.lookify.models.Song;
import com.darbuth.lookify.services.SongService;

@Controller
public class Songs {
	
	private final SongService songService;
	public Songs(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "newsong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("song") Song song,
			BindingResult result) {
		if (result.hasErrors()) {
			return "newsong.jsp";
		} else {
			songService.addSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id,
			Model model) {
		Song song = songService.findById(id);
		model.addAttribute("song", song);
		return "show.jsp";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(value="artist") String search,
			Model model) {
		List<Song> results = songService.searchByArtist(search);
		if (results.isEmpty()) {
			model.addAttribute("found", false);
			model.addAttribute("artist", search);
		} else {
			model.addAttribute("found", true);
			model.addAttribute("results", results);
			model.addAttribute("artist", search);
		}
		return "results.jsp";
	}
	
	@RequestMapping("/songs/topTen")
	public String topTen(Model model) {
		List<Song> results = songService.highestRated();
		model.addAttribute("results", results);
		return "top.jsp";
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		songService.destroySong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/songs/edit/{id}")
	public String update(@PathVariable("id") Long id,
			Model model) {
		Song song = songService.findById(id);
		if (song != null) {
			model.addAttribute("song", song);
		} else {
			return "redirect:/dashboard";
		}
		return "edit.jsp";
	}
	
	@PostMapping("/songs/edit/{id}")
	public String save(@Valid @ModelAttribute("song") Song song,
			BindingResult result,
			@PathVariable("id") Long id) {
		System.out.println(id);
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			song.setId(id);
			songService.updateSong(song);
			return "redirect:/songs/{id}";
		}
	}
}
