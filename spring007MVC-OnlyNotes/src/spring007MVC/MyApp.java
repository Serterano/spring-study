package spring007MVC;
//MVC nedir --> 

		//model --> A model contains the data of the application.
		//A data can be a single object or a collection of objects.
		
		//, view --> JSP+JSTL is used to create a view page 
		
		//, controller(they are also bean) -->  A controller contains the business logic of an application. 
		//Here, the @Controller annotation is used to mark the class as the controller.

		//front Controller -->  In Spring Web MVC, the DispatcherServlet class works as the front controller. 
		//It is responsible to manage the flow of the Spring MVC application.

/*mcv configuration -->

*
* Add configurations to file : WEB-INF/web.xml
* 
* 1-) Configure Spring Mvc Dispatcher Servlet
* 2-) Set Up Url mappings to spring mvc dispatcher servlet
* 
* Add configurations to file : WEB-INF/spring-mvc-demo-servlet.xml
*
* 3-) Add support for spring component scanning
* 4-) Add support for conversion, formatting and validation
* 5-) Configure Spring MVC View Resolver
*/
public class MyApp {

	public static void main(String[] args) {
		
	}

}
