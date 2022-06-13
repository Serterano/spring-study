package paket1;

import org.springframework.stereotype.Component;

//bean id
@Component("TenisKocu")
public class TennisCoach implements Coach {

	@Override
	public String doTrain() {
		// TODO Auto-generated method stub
		return "TennisCoach working with you";
	}


}
