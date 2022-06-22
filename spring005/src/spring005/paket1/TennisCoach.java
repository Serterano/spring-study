package spring005.paket1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//bean id
//@Component("TenisKocu") eğer parametre olarak belirtmessek 
//ilk harfi lowercase yapıp yine nesnesini üretiyor.tennisCoach şeklinde
//default ayarlıyor(autowiring)

@Component
@Scope("prototype")// also can be singleton
public class TennisCoach implements Coach ,DisposableBean{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	//@Qualifier güzel bir yenilik fakat constructor injection kullanırken kullanımı biraz farklı
	
	@Autowired //this annotation for constructor method injection
	public TennisCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@PostConstruct
	public void doMyStartUp() {
		//this method run after constructor and injection dependencies //bean çalıştıktan sonra ki çalışan ilk method(injection ve constructordan sonra)
	}
	@PreDestroy
	public void doMyCleanUp() {
		//this method run before bean is destroyed //bean ölmeden önceki çalışan son method
		//For "prototype" scoped beans, Spring does not call the @PreDestroy method //prototype scope kullanıyorsan @PreDestroy annotationlu method çağrılmayacaktır.
		//fakat bunun için MyCustomBeanProcessor sınıfı yarattık ve DisposableBean arayüzünü implemente ettik yukarda
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(">> TennisCoach: inside destroy()");
		//This method for clean the prototypes 
	}
	
	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "TennisCoach working with you";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	
	


}
