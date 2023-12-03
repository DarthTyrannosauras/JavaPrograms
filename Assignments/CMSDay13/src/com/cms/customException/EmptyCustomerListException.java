package com.cms.customException;

public class EmptyCustomerListException extends Exception {
	public EmptyCustomerListException(String errorMessage) {
		super(errorMessage);
	}
}
