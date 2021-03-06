package paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
				("beanLifeCycle-applicationContext.xml");
		
		//bu sınıf bean singleton ve bean prototype farkını ortaya koyuyor
		
		//beanların scopeları default olarak singleton ayarlanmıştır. 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.dodailyFortune());
		
		context.close();
		
	}

}
