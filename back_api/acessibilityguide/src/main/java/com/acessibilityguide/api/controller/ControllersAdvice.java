package com.acessibilityguide.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.acessibilityguide.api.exceptions.UserNotFoundException;

@RestControllerAdvice
public class ControllersAdvice {
	
	
	@ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> handleValidationExceptions(UserNotFoundException exception) {
    	return new ResponseEntity<Object>(exception.getMessage(), HttpStatus.UNAUTHORIZED);
    }

}
