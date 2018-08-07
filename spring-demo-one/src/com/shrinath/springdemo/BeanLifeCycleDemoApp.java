package com.shrinath.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("myTrackCoach",Coach.class);
		Coach alphaCoach=context.getBean("myTrackCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		System.out.println("\n Pointing to the same object: "+ result);
		
		System.out.println("\nMemory location for the theCoach "+theCoach);
		System.out.println("\nMemory location for the alphaCoach "+alphaCoach);
		
		
	}

}
