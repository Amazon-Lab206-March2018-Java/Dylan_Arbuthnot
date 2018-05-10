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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tags")
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(max = 255)
	private String subject;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date updatedAt;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "questions_tags",
			joinColumns = @JoinColumn(name = "question_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id")
	)
	private List<Question> questions;
	
	public Tag() {
		
	}
	
	public Tag(String subject) {
		this.subject = subject;
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

	public String getSubject() {
		return this.subject;
	}
	
	public void setSubject(String sub) {
		this.subject = sub;
	}
	
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}
	
	public List<Question> getQuestions() {
		return this.questions;
	}
	
	public void updateQuestions(Question q) {
		if (this.questions.contains(q)) {
			this.questions.remove(q);
		} else if (!this.questions.contains(q)) {
			this.questions.add(q);
		}
	}
}
