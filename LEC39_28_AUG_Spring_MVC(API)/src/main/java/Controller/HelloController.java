package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("i am in contact COntroller");
		return "contact";
	}
	
	
	@RequestMapping("/hello")
	public String hello(Model model)
	{
		System.out.println("i am hello controller");
		model.addAttribute("name","Wasif");
		return "hello";
	}
	
	@RequestMapping("/form")
	public String form()
	{
		return "form";
	}
	
	@RequestMapping("/userForm")
	public String userform(@RequestParam("username") String name,
			@RequestParam("email") String email)
	{
		System.out.println(name);
		System.out.println(email);
		return null;
	}
	 
	
	
	
}
