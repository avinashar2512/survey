
package com.survey.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long questionID;

	private String questionText;
	private String questionType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<MultiAnswerOption> multiAnswerOptions;

	@ManyToOne
	@JoinColumn
	public Survey survey;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
	private List<Answer> answer;

	public Question() {

	}

	public Question(String questionText, String questionType, Survey survey) {
		this.questionText = questionText;
		this.questionType = questionType;
		this.survey = survey;
	}

	public Question(Survey survey) {
		this.survey = survey;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public List<MultiAnswerOption> getMultiAnswerOptions() {
		return multiAnswerOptions;
	}

	public void setMultiAnswerOptions(List<MultiAnswerOption> multiAnswerOptions) {
		this.multiAnswerOptions = multiAnswerOptions;
	}

	public void setMultiAnswerOption(String multiAnswerOption) {
		this.multiAnswerOptions.add(new MultiAnswerOption(multiAnswerOption));
	}

	public Long getQuestionID() {
		return questionID;
	}

	public void setQuestionID(Long questionID) {
		this.questionID = questionID;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}