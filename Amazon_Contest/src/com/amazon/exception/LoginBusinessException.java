package com.amazon.exception;


public class LoginBusinessException extends Exception {

	
	private static final long serialVersionUID = 1L;	
	public LoginBusinessException(final String message) {
		super(message);// Calling to the super class constructor

	}
	
	public LoginBusinessException(final String message,
			final Throwable exception) {
		super(message, exception);// Calling to the super class constructor


	}

	public LoginBusinessException(final Throwable exception) {
		super( exception);// Calling to the super class constructor

	
	}

}
