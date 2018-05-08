package com.darbuth.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.darbuth.lookify.models.Song;
import com.darbuth.lookify.repositories.SongRepository;

@Service
public class SongService {

	private SongRepository songRepo;
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	
	public List<Song> allSongs() {
		return songRepo.findAll();
	}
	
	public Song findById(Long id) {
		Optional<Song> song = songRepo.findById(id);
		if (song.isPresent()) {
			return song.get();
		}
		return null;
	}
	
	public List<Song> searchByArtist(String search) {
		return songRepo.findByArtist(search);
	}
	
	public List<Song> highestRated() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	
	public void addSong(Song song) {
		songRepo.save(song);
	}
	
	public void updateSong(Song song) {
		songRepo.save(song);
	}
	
	public void destroySong(Long id) {
		songRepo.deleteById(id);
	}
}
