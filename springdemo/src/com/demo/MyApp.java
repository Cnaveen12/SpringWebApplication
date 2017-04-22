package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = context.getBean("myCoach", CricketCoach.class);
				System.out.println(coach.getCoachAdvice());
				System.out.println(coach.getFortune());
				System.out.println(coach.getEmail());
				System.out.println(coach.getTeam());
				context.close();
				
		
		
	}

}
