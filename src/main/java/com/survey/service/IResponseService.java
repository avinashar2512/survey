package com.survey.service;

import java.util.List;
import java.util.Optional;

import com.survey.domain.Answer;

public interface IResponseService {

	List<Answer> saveResponse(List<String> answertextList, List<Long> questionID);

	Answer saveAnswer(Answer answer);

	List<Answer> getAnswers();

	Optional<Answer> answersById(Long id);

}
