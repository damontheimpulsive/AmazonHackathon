package com.amazon.exception;

/**
 * Exception class for all the exception other than the business rule violation
 * exception including SQL exception,IOEXception etc
 */
public class LoginException extends Exception {

	/**
	 * The serialVersionUID for the serializable class
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Overloaded Constructor
	 * 
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public LoginException(final Throwable exception) {
		super(exception);// Call to the parent class constructor
	}

	/**
	 * Overloaded Constructor
	 * 
	 * @param message
	 *            -The message to be displayed for the particular exception
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public LoginException(final String message, final Throwable exception) {
		super(message, exception);// Call to the parent class constructor
	}

}
