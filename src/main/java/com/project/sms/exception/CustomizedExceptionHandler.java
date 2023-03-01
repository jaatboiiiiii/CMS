package com.project.sms.exception;

import java.net.http.HttpHeaders;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(MethodArgumentMismatchException.class)
	protected final ResponseEntity<Object> handleMethodArgumentMismatch(MethodArgumentMismatchException ex, WebRequest request)  {
		return new ResponseEntity<>(new ErrorDetails("Arguments Not Valid",LocalDateTime.now()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AuthorizationFailedException.class)
	protected final ResponseEntity<Object> handleAuthorizationFailed(AuthorizationFailedException ex, WebRequest request) {
		return new ResponseEntity<>(new ErrorDetails("Invalid email or password",LocalDateTime.now()), HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(UserAlreadyExistsException.class)
	protected final ResponseEntity<Object> handleUserAlreadyExists(UserAlreadyExistsException ex, WebRequest request) {
		return new ResponseEntity<>(new ErrorDetails("User Already Exists",LocalDateTime.now()), HttpStatus.BAD_REQUEST);
	}
}
