package com.acessibilityguide.api.exceptions;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6459448024855578034L;

	public UserNotFoundException(String message) {
		super(message);
	}
	
}
