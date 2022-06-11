package paket1;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public CricketCoach() {}

	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "Cricket Coach is working with you";
	}

	@Override
	public String dodailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
