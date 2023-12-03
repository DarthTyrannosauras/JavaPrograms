package com.cms.customException;

public class EmailNotFoundException extends Exception {
	public EmailNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
