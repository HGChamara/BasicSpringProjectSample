package com.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController 
{

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(ModelMap model) 
	{
		model.addAttribute("message", "welcome user");
		return "index";
	}
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String welcomeString(@PathVariable String name, ModelMap model) 
	{
		model.addAttribute("message", "welcome "+name);
		return "index";
	}
}
