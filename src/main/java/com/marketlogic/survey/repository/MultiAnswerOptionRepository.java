package com.marketlogic.survey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marketlogic.survey.domain.MultiAnswerOption;
@Repository
public interface MultiAnswerOptionRepository extends CrudRepository<MultiAnswerOption, Long> {
	List<MultiAnswerOption> findByAnswerOption(String multiAnswerOption);

	@Override
	List<MultiAnswerOption> findAll();
}
