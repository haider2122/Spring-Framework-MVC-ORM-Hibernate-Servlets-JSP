package com.mappings;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question {

	@Id
	@Column(name="qid")
	int id;
	@Column(name="ques")
	String question;

	//OneToOne
	
/*	@OneToOne//Answer will be a foreign key in this table
	Answer answer;
*/
	
	
	//ManyToMany
	
	@OneToMany(mappedBy="question")
	ArrayList<Answer> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<Answer> getAns() {
		return ans;
	}

	public void setAns(ArrayList<Answer> ans) {
		this.ans = ans;
	}
	
	
}
