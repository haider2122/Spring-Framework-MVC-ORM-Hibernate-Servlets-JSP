package springmvc.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller

public class Controller {
	
	@RequestMapping("/home")
	public String home(Model model){//Using to send data from  controller to view
		
		model.addAttribute("website_name","Haiders MVC Practice");
		model.addAttribute("welcome_message","Hi, I'm practicing,but you can hang around.");
		
		
		
		System.out.println("Home Url from controller class");
		return "home";
	}
	
	
	@RequestMapping("/about")
	public ModelAndView about(){//using ModelAndView here 
		//Note that we are returing ModelAndView object here
		
		ModelAndView mv= new ModelAndView();
		
		ArrayList<String> ilike= new ArrayList<String>();
		
		ilike.add("Philosophy");
		ilike.add("Software Engineering");
		ilike.add("Software Engineering");
		
		mv.addObject("name", "Haider");
		mv.addObject("id",2065);
		mv.addObject("interests",ilike);
		
		
		mv.setViewName("about");
		
		System.out.println("About url from controller class");
		return mv;
	}

}
