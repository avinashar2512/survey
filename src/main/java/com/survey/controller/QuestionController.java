package com.survey.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.domain.MultiAnswerOption;
import com.survey.domain.Question;
import com.survey.service.IMultiAnswerOptionService;
import com.survey.service.IQuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	private IQuestionService questionService;

	@Autowired
	private IMultiAnswerOptionService multiAnswerOptionService;

	@GetMapping
	public ResponseEntity<List<Question>> questionList() {
		return new ResponseEntity<>(questionService.questionList(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Question> addQuestion(Question question) {
		return new ResponseEntity<>(questionService.addQuestion(question), HttpStatus.CREATED);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Question>> findQuestionById(@PathVariable Long id) {
		return new ResponseEntity<>(questionService.findQuestionById(id), HttpStatus.OK);
	}

	@PostMapping(value = "multioption")
	public ResponseEntity<MultiAnswerOption> saveMultiOption(MultiAnswerOption multiOption) {
		return new ResponseEntity<>(multiAnswerOptionService.save(multiOption), HttpStatus.CREATED);

	}

}
