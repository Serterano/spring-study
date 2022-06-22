package spring005.paket1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
	
		boolean result = theCoach == alphaCoach;
		
		//@Scope("") default value is "singleton" 
		//singleton--> tek bir obje yarat o objeyi isteyen isteğe bu objeyi ver
		//prototype --> her istek için bu objenin yenisini yarat.
		
		//@PostConstruct --> injection ve constructordan sonra çalışacak kod
		
		//@PreDestroy --> bean yok edilmeden önce çalışan kod.(bean yok edilmeden o componentte temizlenecek şeyleri yazarsın)
		
		//bu 2 annotation java 9 ve üstünde yok paket olarak eklemelisin  (javax.annotation-api-1.3.2)
		if(result) {
			System.out.println("2 object are same");
		}
		else {
			System.out.println("2 object are not same");
		}
		context.close();
	}

}
