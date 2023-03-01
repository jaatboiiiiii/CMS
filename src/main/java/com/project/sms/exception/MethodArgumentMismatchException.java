package com.project.sms.exception;

public class MethodArgumentMismatchException extends RuntimeException {
	private String message;

	public MethodArgumentMismatchException(String message) {
		super();
		this.message = message;
	}

	public MethodArgumentMismatchException() {
		super();
	}
	
}
