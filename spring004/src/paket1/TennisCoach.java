package paket1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean id
//@Component("TenisKocu") eğer parametre olarak belirtmessek 
//ilk harfi lowercase yapıp yine nesnesini üretiyor.tennisCoach şeklinde
//default ayarlıyor(autowiring)
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired //this annotation for constructor injection
	public TennisCoach(FortuneService fortuneService) {
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
	


}
