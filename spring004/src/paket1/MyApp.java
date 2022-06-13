package paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//config beans to spring
		
		Coach coach = context.getBean("TenisKocu",Coach.class);//get bean
		
		System.out.println(coach.doTrain());
		
		context.close();
	}

}
