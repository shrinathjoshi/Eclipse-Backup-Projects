package com.shrinath.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricketcoach : inside setter method of Email Address");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricketcoach : inside setter method of Team");

		this.team = team;
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricketcoach : inside setter method");

		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("Cricketcoach : inside no-args constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play ciricket for 2 hours \n Practice Fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bring it On Baby : "+ fortuneService.getFortune() ;
	}

}
