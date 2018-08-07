package com.shrinath.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a Hark 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it : "+fortuneService.getFortune();
	}
	//add an init method 
		public void doMyStartUpStuff() {
			System.out.println("TrackCoach : Inside method doMyStartUpStuff");
		}
		
		public void doMyCleanUpStuff() {
			System.out.println("TrackCoach : Inside method doMyCleanUpStuff");
		}
		
	
	

}
