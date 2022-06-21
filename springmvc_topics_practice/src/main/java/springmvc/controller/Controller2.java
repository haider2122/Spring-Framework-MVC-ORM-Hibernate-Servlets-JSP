package springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller2 {
	
	@RequestMapping("learning_exceptions")
	public String func(){
		
		System.out.println("In func");
		
//		String s=null;
//		
//		System.out.println(s.length());
		return "learning_exceptions";
	}

}
