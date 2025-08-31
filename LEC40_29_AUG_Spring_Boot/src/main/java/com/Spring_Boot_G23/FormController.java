package com.Spring_Boot_G23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	
	@RequestMapping("/form")
	public String form()
	{
		System.out.println("I am In FOrm COntroller");
		return "form";
	}
}
