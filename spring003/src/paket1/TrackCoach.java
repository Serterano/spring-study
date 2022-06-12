package paket1;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;//dependency
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService; 
		//dependency injection in constructor
		
		//applicationContext yukarıda ki referansı kullanaraktan
		//dependency injectionu gerçekleştiriyor
 	}
	@Override
	public String doTrain() {
		return "Run a hard 5k";
	}

	@Override
	public String dodailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff()");
	}
	
	public void doCleanUpStuff() {
		System.out.println("TrackCoach: inside method doCleanUpStuff()");
	}

}










