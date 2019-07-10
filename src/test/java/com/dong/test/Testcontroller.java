package com.dong.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Testcontroller {
	
	@RequestMapping("/testMethod")
	public String testMethod(Model model) {
		String msg="hello";
		model.addAttribute("msg",msg);
		return "test";
	}
}
