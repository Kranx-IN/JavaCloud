package com.capgemini.exceptions;

public class OrderException extends Exception {
	private String message;
	
	public OrderException(String message)
	{
		this.setMessage(message);
	}
	
	public OrderException(String message, Exception e)
	{
		super(e);
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}		
}
