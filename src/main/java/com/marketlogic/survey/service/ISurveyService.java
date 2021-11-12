package com.marketlogic.survey.service;

import java.util.List;

import com.marketlogic.survey.domain.Survey;

public interface ISurveyService {

	List<Survey> surveyList();

	Survey saveSurvey(Survey survey);

	Survey editSurvey(Survey survey);

	void deleteSurvey(long id);

}
