package springmvc.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@org.springframework.stereotype.Controller
public class Controller {


	
	@RequestMapping("home")
	public String home(Model model){

//		
	String s=null;
		System.out.println(s.length());
		System.out.println("Home page");
		
		return "home";
	}

		
	@RequestMapping(path="validate", method=RequestMethod.POST)
	public String validate(@ModelAttribute("user") User user,Model model,BindingResult result){
		
		//Here BindingResult is used to handle errors
		
		System.out.println("Validating form");
		//model.addAttribute("message","Successfully rendered");
		
		
		if(result.hasErrors()){
			return "redirect:/home";

		}else{
		
		
		if(user.getUserId()==2065){
			
			
			
			return "validate";
		}else{
			
			return "redirect:/home";//Using Redirect Prefix Method
		}
		
		
		
		}
	
	
		
	
		
	}
	
	//a null pointer exception
	
	//you can create as many specific exceptions as you like
	//or also a generic one
//	@ExceptionHandler(value=NullPointerException.class)
//	public String ExceptionHandlerNull(Model model){
//		System.out.println("in handler");
//		
//		model.addAttribute("message", "A server side error has occured");
//		
//		return "exception_handler";
//	}
//	@ExceptionHandler(value=Exception.class)
//	public String ExceptionHandlerAll(Model model){
//		System.out.println("in handler");
//		
//		model.addAttribute("message", "A server side error has occured");
//		
//		return "exception_handler";
//	}

	//We are Shifting these to the centralised controller

}
