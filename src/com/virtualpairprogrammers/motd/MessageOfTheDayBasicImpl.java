package com.virtualpairprogrammers.motd;

public class MessageOfTheDayBasicImpl implements MessageOfTheDayService {

	private String message;
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getTodyasMessage() {
		return this.message;
	}

}
