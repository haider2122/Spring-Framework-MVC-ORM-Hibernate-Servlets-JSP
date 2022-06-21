package com.mappings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="answers")
public class Answer {

	@Id
	@Column(name="aid")
	int id;
	@Column(name="ans")
	String answer;
	
	//OneToOne
/*	@OneToOne(mappedBy="answer")//here the question F.K field will not be created in the question table
	Question question;*/
	
	@ManyToOne
	Question question;
	
	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	
	
}
