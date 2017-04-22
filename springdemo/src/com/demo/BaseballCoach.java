package com.demo;

public class BaseballCoach implements Coach {
	
	private Fortune fortune;
	
	public BaseballCoach(Fortune myfortune){
		fortune = myfortune;
	}

	@Override
	public String getCoachAdvice() {
		
		return "Run like a dog for 3km every day!";
	}

	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}
	
	

}
