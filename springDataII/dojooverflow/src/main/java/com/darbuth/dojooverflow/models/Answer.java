package com.darbuth.dojooverflow.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "answers")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min = 12, message = "must be at least 12 characters")
	private String answer;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	private Question question;
	
	public Answer() {
		
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
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(String ans) {
		this.answer = ans;
	}
	
	public Date getCreatedAt() {
		return this.createdAt;
	}
	
	public Date getUpdatedAt() {
		return this.updatedAt;
	}
	
	public Question getQuestion() {
		return this.question;
	}
	
	public void setQuestion(Question q) {
		this.question = q;
	}
}
