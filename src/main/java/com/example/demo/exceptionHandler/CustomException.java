package com.example.demo.exceptionHandler;

public class CustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CustomException(String errorMessage) {
		super(errorMessage);
	}
}
