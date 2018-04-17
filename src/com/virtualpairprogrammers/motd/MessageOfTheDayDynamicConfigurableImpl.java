package com.virtualpairprogrammers.motd;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MessageOfTheDayDynamicConfigurableImpl implements MessageOfTheDayService {

	
	private String[] messageList;
	
	public void setMessageList(String[] messageList) {
		this.messageList = messageList;
	}
	

	@Override
	public String getTodyasMessage() {
		int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
		
		String message = messageList[day-1];
		
		return message;
	}

}
