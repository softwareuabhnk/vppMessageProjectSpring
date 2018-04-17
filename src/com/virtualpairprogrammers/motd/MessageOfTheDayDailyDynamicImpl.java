package com.virtualpairprogrammers.motd;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MessageOfTheDayDailyDynamicImpl implements MessageOfTheDayService {

	private String[] messages = new String[]
			{
					"Sunday morning",
					"Just another manic Monday",
					"Forget Java on Tuesday",
					"No more waiting on Wednesday",
					"Ohh Thursday",
					"Yes Friday",
					"Saturday night"
			};
	
	
	@Override
	public String getTodyasMessage() {
		int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
		
		String message = messages[day-1];
		
		return message;
	}

}
