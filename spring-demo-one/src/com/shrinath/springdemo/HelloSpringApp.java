package com.shrinath.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before ClassPathXml");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("After ClassPathXml\n Before Getting bean");
		CricketCoach theCoach= (CricketCoach) context.getBean("myCricketCoach");
		System.out.println("Hola Got the Bean ::: Give me my Workout and fortune");
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		context.close();
	}

}
