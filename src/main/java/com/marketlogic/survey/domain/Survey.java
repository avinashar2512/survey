package com.marketlogic.survey.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long surveyId;

    private String surveyName;
    private String surveyDesc;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<Question> questionList;


    public Survey() {

    }

    public Survey(String surveyName, String surveyDesc) {
        this.surveyName = surveyName;
        this.surveyDesc = surveyDesc;
    }

    public Survey(String surveyName) {
        this.surveyName = surveyName;
    }

    public Long getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyDesc() {
		return surveyDesc;
	}

	public void setSurveyDesc(String surveyDesc) {
		this.surveyDesc = surveyDesc;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
    public String toString() {
        return surveyName;
    }
}