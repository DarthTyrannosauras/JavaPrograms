package com.cms.customException;

public class AgeNotSatisfiedException extends Exception {
	public AgeNotSatisfiedException(String errorMessage) {
		super(errorMessage);
	}
}
