package com.survey.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.domain.Answer;
import com.survey.repository.AnswerRepository;
import com.survey.repository.QuestionRepository;
import com.survey.service.IResponseService;

@RestController
@RequestMapping("/responses")
public class ResponseController {
	

	@Autowired
	private IResponseService responseService;

	@PostMapping
	@RequestMapping("/answers")
	public ResponseEntity<Answer> saveAnswer(@RequestBody Answer answer) {
		return new ResponseEntity<>(responseService.saveAnswer(answer), HttpStatus.CREATED);

	}

	@PostMapping
	@RequestMapping("/multiple/answers")
	public ResponseEntity<List<Answer>> saveResponse(@RequestBody List<String> answertextList, List<Long> questionID) {
		return new ResponseEntity<>(responseService.saveResponse(answertextList, questionID), HttpStatus.CREATED);
	}

	@GetMapping
	@RequestMapping(value = "/allanswers")
	public ResponseEntity<List<Answer>> getAnswers() {
		return new ResponseEntity<>(responseService.getAnswers(), HttpStatus.OK);
	}

	@GetMapping
	@RequestMapping(value = "/answer/{id}")
	public ResponseEntity<Optional<Answer>> answersById(@PathVariable Long id) {
		return new ResponseEntity<>(responseService.answersById(id), HttpStatus.OK);
	}
}