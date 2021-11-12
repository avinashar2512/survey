package com.marketlogic.survey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marketlogic.survey.domain.Question;
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
	List<Question> findByQuestionText(String question);

	List<Question> findByQuestionType(String questionType);

	@Override
	List<Question> findAll();
}
