package paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		// use the object
		System.out.println(theCoach.doTrain());	
		
		System.out.println(theCoach.dodailyFortune());
		
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach.getEmailAddress());
		context.close();
	}

}
