package com.survey.service;

import java.util.List;

import com.survey.domain.Survey;

public interface ISurveyService {

	List<Survey> surveyList();

	Survey saveSurvey(Survey survey);

	Survey editSurvey(Survey survey);

	void deleteSurvey(long id);

}
