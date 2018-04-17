package com.virtualpairprogrammers.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.motd.MessageOfTheDayService;

public class ClientApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new
				ClassPathXmlApplicationContext("application.xml");

		MessageOfTheDayService helloWorld = 
				container.getBean("motdService", MessageOfTheDayService.class);
		
		System.out.println(helloWorld.getTodyasMessage());
		
		container.close();

	}

}
