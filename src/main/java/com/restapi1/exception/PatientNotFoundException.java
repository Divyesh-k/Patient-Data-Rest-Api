package com.restapi1.exception;

public class PatientNotFoundException extends RuntimeException{

	public PatientNotFoundException(int id) {
		super("Could not found Data " + id);
	}
	
}
