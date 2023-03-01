package com.project.sms.exception;

public class UserAlreadyExistsException extends RuntimeException {
	private String message;

	public UserAlreadyExistsException(String message) {
		super();
		this.message = message;
	}

	public UserAlreadyExistsException() {
		super();
	}
}
