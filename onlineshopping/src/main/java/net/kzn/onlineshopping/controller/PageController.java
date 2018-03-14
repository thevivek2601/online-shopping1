package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/test"} )
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("gretting","Welcome to Spring MVC");
	    return mv;
	}

}
