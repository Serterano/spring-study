package spring005.paket1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	public TrackCoach() {
		//we are not using constructor injection
	}

	@Autowired
	@Qualifier("sadFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "Track Coach working with you";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	
	

}
