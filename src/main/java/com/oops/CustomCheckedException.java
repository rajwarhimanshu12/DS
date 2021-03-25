package com.oops;

public class CustomCheckedException extends Exception {

	private static final long serialVersionUID = -1234587654;
	private int id;
	
	CustomCheckedException(int id, String message){
		super(message);
		this.id = id;
	}
	CustomCheckedException(int id, String message, String cause){
		super(message, new Throwable(cause));
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("EmployeeNotFoundException[%d]", this.id);
	}

	}
