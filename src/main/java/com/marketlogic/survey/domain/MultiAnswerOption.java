package com.marketlogic.survey.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MultiAnswerOption {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long multiAnswerOptionsId;

	private String answerOption;

	@ManyToOne
	@JoinColumn
	private Question question;

	public MultiAnswerOption() {

	}

	public MultiAnswerOption(String answerOption, Question question) {
		super();
		this.answerOption = answerOption;
		this.question = question;

	}

	public MultiAnswerOption(Question question) {
		this.question = question;

	}

	public MultiAnswerOption(String answerOption) {
		this.answerOption = answerOption;
	}

	public Long getMultiAnswerOptionsId() {
		return multiAnswerOptionsId;
	}

	public void setMultiAnswerOptionsId(Long multiAnswerOptionsId) {
		this.multiAnswerOptionsId = multiAnswerOptionsId;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswerOption() {
		return answerOption;
	}

	public void setAnswerOption(String answerOption) {
		this.answerOption = answerOption;
	}

}
