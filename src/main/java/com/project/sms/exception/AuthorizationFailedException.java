package com.project.sms.exception;

public class AuthorizationFailedException extends RuntimeException {
	private String message;

	public AuthorizationFailedException(String message) {
		super(message);
	}

	public AuthorizationFailedException() {
		super();
	}
	
}
