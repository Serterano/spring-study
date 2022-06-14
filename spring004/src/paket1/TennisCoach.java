package paket1;

import org.springframework.stereotype.Component;

//bean id
//@Component("TenisKocu") eğer parametre olarak belirtmessek 
//ilk harfi lowercase yapıp yine nesnesini üretiyor.tennisCoach şeklinde
//default ayarlıyor
@Component
public class TennisCoach implements Coach {

	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "TennisCoach working with you";
	}


}
