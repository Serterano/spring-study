package spring005.paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//config bean annotation to spring
		
		//this project include qualifiers
		
		BaseballCoach coach = context.getBean("baseballCoach",BaseballCoach.class);//get bean
		
		System.out.println(coach.doTrain());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
