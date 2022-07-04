package me.serterano.com;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //this class inherits from @Component ... support scanning
public class HomeController {

	// /WEB-INF/view/main-menu.jsp 
	// jsp is suffix
	// main-menu is view name
	// WEB-INF/view is prefix
	
	//SPRING MVC CONTROLLER CODE MAY NOT WORK THIS IS AN ECLIPSE CACHING BUG
	//You need to access the correct URL, localhost:8080/spring-mvc-demo/
//Note: Do not attempt to run the JSP files directly. This will not work due to MVC.
	
	//Be sure to select tomcat 9 otherwise it will cannot run
	
	@RequestMapping("/") //
	public String showMyPage() {
		return "main-menu";//View name
		//request paramaters,  session objects ,model object can be return
	}
	
	@RequestMapping("/MyProfile")
	public String showMyProfile() {
		return "MyProfile";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "processForm";
	}
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request,Model model) {
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Yo! "+theName;
		
		model.addAttribute("message",result);
		
		
		return "processForm";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Hey my friend "+theName;
		
		model.addAttribute("message",result);
		
		
		return "processForm";
	}
}
