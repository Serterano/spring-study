package paket1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class TennisCoach implements Coach ,DisposableBean{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	
	@Autowired
	public TennisCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@PostConstruct
	public void doMyStartUp() {
	}
	@PreDestroy
	public void doMyCleanUp() {
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(">> TennisCoach: inside destroy()");
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
