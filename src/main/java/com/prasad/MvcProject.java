package com.prasad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcProject {
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mvc = new ModelAndView();

		mvc.addObject("msg", "Welcome Prasad Reddy.....!!");
		mvc.setViewName("message");

		return mvc;
	}

	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mvc = new ModelAndView();

		mvc.addObject("msg", "This is Greet Method Calling.....mr.prasadreddy!!");
		mvc.setViewName("message");

		return mvc;
	}
}
