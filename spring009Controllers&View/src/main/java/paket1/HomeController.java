package paket1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this class inherits from @Component ... support scanning
public class HomeController {

	// /WEB-INF/view/main-menu.jsp 
	// jsp is suffix
	// main-menu is view name
	// WEB-INF/view is prefix
	
	@RequestMapping("/") //
	public String showMyPage() {
		return "main-menu";//View name
		//request paramaters,  session objects ,model object can be return
	}
}
