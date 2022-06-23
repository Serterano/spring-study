package paket1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//step 1 :no xml configuration
@ComponentScan("paket1")//step 2 (optional):no xml configuration
public class MyApp {

	//this project includes: no xml configuration,
	public static void main(String[] args) {
		//3 ways configuring spring container
		
		//1-)full xml config(bean scopes bean id etc) >>işledik
		//2-)component-scan only xml >> işledik
		//3-)no xml >> bu projede işlendi
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyApp.class);//step 3 :no xml configuration
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.doTrain());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
