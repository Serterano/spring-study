package paket1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("paket1")
public class MyApp2 {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyApp.class);
		
//		Coach theCoach = context.getBean("swimCoach",Coach.class);
//		
//		System.out.println(theCoach.doTrain());
//		
//		System.out.println(theCoach.getDailyFortune());
		
		
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//this object created for sport.properties
		System.out.println(theCoach.doTrain());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		context.close();
	}
}
