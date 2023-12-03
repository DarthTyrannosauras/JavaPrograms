package com.cms.customException;

public class DuplicateCustomerFoundException extends Exception {
	public DuplicateCustomerFoundException(String errorMessage) {
		super(errorMessage);
	}
}
