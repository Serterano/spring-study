package paket1;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
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
