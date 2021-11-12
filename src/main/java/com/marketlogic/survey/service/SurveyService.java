package com.marketlogic.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketlogic.survey.domain.Survey;
import com.marketlogic.survey.repository.SurveyRepository;
@Service
public class SurveyService implements ISurveyService {

	@Autowired
	SurveyRepository surveyRepository;

	@Override
	public List<Survey> surveyList() {
		return surveyRepository.findAll();
	}

	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepository.save(survey);
	}

	@Override
	public Survey editSurvey(Survey survey) {
		return surveyRepository.save(survey);
	}

	@Override
	public void deleteSurvey(long id) {
		surveyRepository.deleteById(id);;
	}

}
