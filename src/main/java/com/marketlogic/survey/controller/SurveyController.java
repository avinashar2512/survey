package com.marketlogic.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketlogic.survey.domain.Survey;
import com.marketlogic.survey.service.ISurveyService;

@RestController
@RequestMapping("/surveys")
public class SurveyController {

	@Autowired
	private ISurveyService surveyService;

	@GetMapping
	public ResponseEntity<List<Survey>> surveyList() {
		return new ResponseEntity<>(surveyService.surveyList(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey) {
		Survey surveyResponse = surveyService.saveSurvey(survey);
		return new ResponseEntity<>(surveyResponse, HttpStatus.CREATED);// Redirects to /surveylist endpoint
	}

	@PutMapping
	public ResponseEntity<Survey> editSurvey(@RequestBody Survey survey) {
		if(survey.getSurveyId()>0) {
		Survey surveyResponse = surveyService.editSurvey(survey);
		return new ResponseEntity<>(surveyResponse, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping
	public ResponseEntity<Void> deleteSurvey(@RequestBody long id) {
		if (id>0) {
			surveyService.deleteSurvey(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} 
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
	}

}
