package spring005.paket1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	//field injection yaparken fortuneService  referansının hangi 
	//arayüzün gerçekleştirmesini olduğunu spring bilemez o yüzden @Qualifier("inject etmek istediğin bean id") kullanırız
	
	//projede constructor injection olan bir bean varsa proje hata mesajı verebilir o yüzden sprin004 projesinde qualifier kullanmadık
	
	@Autowired
	@Qualifier("sadFortuneService")
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
