package com.shrinath.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("myTrackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
