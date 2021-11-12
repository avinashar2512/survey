package com.marketlogic.survey.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketlogic.survey.domain.Question;
import com.marketlogic.survey.repository.QuestionRepository;
@Service
public class QuestionService implements IQuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> questionList() {
		return questionRepository.findAll();
	}

	@Override
	public Question addQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> findQuestionById(Long id) {
		return questionRepository.findById(id);
	}

}
