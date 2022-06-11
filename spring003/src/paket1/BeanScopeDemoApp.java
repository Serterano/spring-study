package paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
				("beanScope-applicationContext.xml");
		
		//bu sınıf bean singleton ve bean prototype farkını ortaya koyuyor
		
		//beanların scopeları default olarak singleton ayarlanmıştır. 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(result);
		System.out.println("\n memory loc for theCoach"+theCoach);
		System.out.println("\n memory loc for theCoach"+alphaCoach);
		
		context.close();
		
	}

}
