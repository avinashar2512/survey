package com.survey.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.survey.domain.Respondent;
@Repository
public interface RespondentRepository extends CrudRepository<Respondent, Long> {
	@Override
    List<Respondent> findAll();
}
