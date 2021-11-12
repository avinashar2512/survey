package com.marketlogic.survey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marketlogic.survey.domain.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List<Answer> findByAnswerText(String answerText);

	@Override
	List<Answer> findAll();
}
