package paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",BaseballCoach.class);
		
		// use the object
		System.out.println(theCoach.doTrain());	
		
		System.out.println(theCoach.dodailyFortune());
		
		context.close();
	}

}
