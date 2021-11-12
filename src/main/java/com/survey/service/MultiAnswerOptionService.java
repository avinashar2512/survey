package com.survey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.domain.MultiAnswerOption;
import com.survey.repository.MultiAnswerOptionRepository;
@Service
public class MultiAnswerOptionService implements IMultiAnswerOptionService {

	@Autowired
	MultiAnswerOptionRepository multiAnswerOptionRepository;

	@Override
	public MultiAnswerOption save(MultiAnswerOption multiOption) {
		return multiAnswerOptionRepository.save(multiOption);
	}

}
