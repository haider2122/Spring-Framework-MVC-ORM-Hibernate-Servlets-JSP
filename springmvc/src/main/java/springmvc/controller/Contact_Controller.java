package springmvc.controller;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;

@org.springframework.stereotype.Controller

public class Contact_Controller {
	
	@RequestMapping("/contact")
	public String home(){//Using to send data from  controller to view
		
		
		
		
		
		System.out.println("Accessing contact form from controller class");
		return "contact";
	}
	
	//RequestParam,Model Attribute= view------>control
	//Model, ModelAndView= control------->view
	
//	@RequestMapping(path="/processdetails",method=RequestMethod.POST)
//	public String login_result(@RequestParam("userName") String name,
//			@RequestParam("userEmail") String email,
//			@RequestParam("userPhone") String phone, Model model
//			){//Using to send data from  controller to view
//		
//		System.out.println(name);
//		
//		model.addAttribute("userName",name);
//		model.addAttribute("userEmail",email);
//		model.addAttribute("userPhone",phone);
//		System.out.println("Accessing processdetails handler funcion from controller class");
//		return "login_result";
//	}
//	
	
	
	//Doing the above twice as easily using @ModelAttribute
	
	@RequestMapping(path="/processdetails",method=RequestMethod.POST)
	public String login_result(@ModelAttribute User user,Model model
	){
		
//use same variable names in user class,or else it doesn't map values
//Model directly allows us to use the values
	
	
	System.out.println("Accessing processdetails handler funcion from controller class");
		return "login_result";
	}

	
	
}
