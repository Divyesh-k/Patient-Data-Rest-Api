package com.restapi1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.restapi1.exception.PatientNotFoundException;

@ControllerAdvice
public class PatientNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(PatientNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String PatientNotFound(PatientNotFoundException ex) {
		return ex.getMessage();
	}
	
}
