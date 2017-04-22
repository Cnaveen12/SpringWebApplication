package com.demo;

public class CricketCoach implements Coach {
	
	private Fortune fortune;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	public String getCoachAdvice(){
		return "Run 20 hrs a week!";
	}

	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}

}
