package com.cms.customException;

public class InsufficientAmountException extends Exception {
	public InsufficientAmountException(String errorMessage) {
		super(errorMessage);
	}
}
