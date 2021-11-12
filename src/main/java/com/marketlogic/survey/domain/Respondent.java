package com.marketlogic.survey.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Respondent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RespondentID;

	private List<Answer> answerList;

	public Respondent(List<Answer> answers) {
		this.answerList = answers;
	}

	public Respondent() {
	}

	public Long getRespondentID() {
		return RespondentID;
	}

	public void setRespondentID(Long respondentID) {
		RespondentID = respondentID;
	}

	public List<Answer> getAnswerList() {
		return answerList;
	}

	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}

}
