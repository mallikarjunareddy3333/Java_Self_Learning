package com.arjun.java.exceptions;

public class PenNotWorkingException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public PenNotWorkingException() {
		super();
	}
	
	public PenNotWorkingException(String message) {
		super(message);
	}
	
	public PenNotWorkingException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
