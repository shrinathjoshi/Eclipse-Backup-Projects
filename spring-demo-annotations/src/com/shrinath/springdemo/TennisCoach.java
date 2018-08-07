package com.shrinath.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	
	public TennisCoach() {
		System.out.println("TennisCoach : Inside default constructor");
		// TODO Auto-generated constructor stub
	}
/*	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside setter method");		
		this.fortuneService = fortuneService;
	}

*/	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
}

}
