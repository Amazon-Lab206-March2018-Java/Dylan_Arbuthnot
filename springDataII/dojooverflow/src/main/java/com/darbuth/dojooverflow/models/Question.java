package com.darbuth.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min = 12, max = 1000, message = "must be at least 12 characters")
	private String question;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date updatedAt;
	
	@OneToMany(mappedBy="question", fetch = FetchType.LAZY)
	private List<Answer> answers;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "questions_tags",
			joinColumns = @JoinColumn(name = "question_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id")
	)
	private List<Tag> tags;
	
	public Question () {
		
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public void setQuestion(String q) {
		this.question = q;
	}
	
	public Date getCreatedAt() {
		return this.createdAt;
	}
	
	public Date getUpdatedAt() {
		return this.updatedAt;
	}
	
	public List<Answer> getAnswers() {
		return this.answers;
	}
	
	public void updateAnswers(Answer a) {
		if (this.answers.contains(a)) {
			this.answers.remove(a);
		} else if (!this.answers.contains(a)) {
			this.answers.add(a);
		}
	}
	
	public List<Tag> getTags() {
		return this.tags;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public void updateTags(Tag tag) {
		this.tags.add(tag);
	}
	
}
