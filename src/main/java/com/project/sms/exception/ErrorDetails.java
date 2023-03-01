package com.project.sms.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private String message;
	private LocalDateTime date;
	public ErrorDetails(String message, LocalDateTime date) {
		super();
		this.message = message;
		this.date = date;
	}
	public ErrorDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", date=" + date + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
}
