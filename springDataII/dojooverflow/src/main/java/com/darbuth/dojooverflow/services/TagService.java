package com.darbuth.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darbuth.dojooverflow.models.Tag;
import com.darbuth.dojooverflow.repositories.TagRepo;

@Service
public class TagService {

	private final TagRepo tr;
	public TagService(TagRepo tr) {
		this.tr = tr;
	}
	
	public List<Tag> allTags() {
		return tr.findAll();
	}
	
	public void createTag(Tag tag) {
		tr.save(tag);
	}
	
	public Tag findTagBySubject(String subject) {
		Tag tag = tr.findBySubject(subject);
		if (tag != null) {
			return tag;
		}
		return tr.save(new Tag(subject));
	}
}
