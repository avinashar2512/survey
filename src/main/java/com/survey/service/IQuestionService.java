package com.survey.service;

import java.util.List;
import java.util.Optional;

import com.survey.domain.Question;

public interface IQuestionService {

	List<Question> questionList();

	Question addQuestion(Question question);

	Optional<Question> findQuestionById(Long id);

}
