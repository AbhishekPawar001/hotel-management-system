package com.hms.hotel.exceptions;


public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 4271483364405269664L;

	public ResourceNotFoundException() {
		super("Resource not found");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
