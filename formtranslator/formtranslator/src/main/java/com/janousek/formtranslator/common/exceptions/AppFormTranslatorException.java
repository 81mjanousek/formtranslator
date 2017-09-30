package com.janousek.formtranslator.common.exceptions;

public class AppFormTranslatorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;

	public AppFormTranslatorException() {
		super();
		generateId();
	}

	public AppFormTranslatorException(String message, Throwable cause) {
		super(message, cause);
		generateId();
	}

	public AppFormTranslatorException(String message) {
		super(message);
		generateId();
	}

	public AppFormTranslatorException(Throwable cause) {
		super(cause);
		generateId();
	}

	public long getId() {
		return id;
	}

	protected void generateId() {
		// generate Id
		this.id = System.currentTimeMillis();
	}

	public String getMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Critical Application Exception [" + id + "]");
		return sb.toString();
	}

}
