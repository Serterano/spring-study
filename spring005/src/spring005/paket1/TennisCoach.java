package spring005.paket1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//bean id
//@Component("TenisKocu") eğer parametre olarak belirtmessek 
//ilk harfi lowercase yapıp yine nesnesini üretiyor.tennisCoach şeklinde
//default ayarlıyor(autowiring)

@Component
public class TennisCoach implements Coach {

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
