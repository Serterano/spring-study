package paket1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;//field injection --> no need setter method or constructor
	
	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "Baseball Coach working with you";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
