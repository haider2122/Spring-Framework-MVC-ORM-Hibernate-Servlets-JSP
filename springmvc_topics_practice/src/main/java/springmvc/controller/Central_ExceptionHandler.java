package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice//annotation to show that this is the central handler
public class Central_ExceptionHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String ExceptionHandlerAll(Model model){
		System.out.println("in centralised handler");
		
		model.addAttribute("message", "A server side error has occured");
		
		return "exception_handler";
	}

	
	
}
