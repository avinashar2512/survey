package com.marketlogic.survey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marketlogic.survey.domain.Survey;
@Repository
public interface SurveyRepository extends CrudRepository<Survey, Long> {
	List<Survey> findBySurveyName(String surveyName);

	@Override
	List<Survey> findAll();
}
