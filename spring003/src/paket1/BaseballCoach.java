package paket1;

public class BaseballCoach implements Coach {

	//Dependency injection'un 1.başlığı olan constructor 
	//injectionu ele aldık
	//1-)constructor injection
	//2-)setter injection
	//3-)auto-wiring(annotation) injection
	
	private FortuneService fortuneService;//dependency
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService; 
		//dependency injection in constructor
		
		//applicationContext yukarıda ki referansı kullanaraktan
		//dependency injectionu gerçekleştiriyor
 	}
	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "BaseballCoach training you";
	}
	@Override
	public String dodailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
