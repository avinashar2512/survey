package com.marketlogic.survey.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketlogic.survey.domain.Answer;
import com.marketlogic.survey.domain.Respondent;
import com.marketlogic.survey.repository.AnswerRepository;
import com.marketlogic.survey.repository.QuestionRepository;
@Service
public class ResponseService implements IResponseService {

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public List<Answer> saveResponse(List<String> answertextList, List<Long> questionID) {
		Respondent respondent = new Respondent();
		List<Answer> answerList = new ArrayList<Answer>();
		for (int i = 0; i < answertextList.size(); i++) {
			answerList.add(answerRepository.save(new Answer(respondent,
					questionRepository.findById(questionID.get(i)).get(), answertextList.get(i))));
		}
		return answerList;
	}

	@Override
	public Answer saveAnswer(Answer answer) {
		return answerRepository.save(answer);
	}

	@Override
	public List<Answer> getAnswers() {
		return answerRepository.findAll();
	}

	@Override
	public Optional<Answer> answersById(Long id) {
		return answerRepository.findById(id);
	}

}
