package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.dao.BooksDao;
import com.mvc.model.Books;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	BooksDao dao;
	
	@RequestMapping("/home")
	public String home(Model model){
		
		model.addAttribute("books",dao.getBooks());

		return "home";
	}
	@RequestMapping("/addBooks")
	public String addBooks(){
		System.out.println("In addBooks");
		return "addBooks";
	}
	
	@RequestMapping(value="/saveDetails",method=RequestMethod.POST)
	public RedirectView saveDetails(@ModelAttribute Books book,HttpServletRequest req){
		RedirectView rdv=new RedirectView();
		System.out.println(book);
		this.dao.CreateBooks(book);
		rdv.setUrl(req.getContextPath()+"/home");
		return rdv;
	}
	
	
	@RequestMapping(value="/deleteBooks/{bid}")
	public RedirectView deleteBooks(@PathVariable("bid") int bid,HttpServletRequest req){
		System.out.println("In delBooks");
		
		RedirectView rdv=new RedirectView();
		
		this.dao.deleteBook(bid);
		
		rdv.setUrl(req.getContextPath()+"/home");
		System.out.println(bid);
		return rdv;
	}
	
	@RequestMapping(value="/accessNotes/{bid}")
	public String accessNotes(@PathVariable("bid") int bid,Model model,HttpServletRequest req){
		System.out.println("In Notes");
		
		
		
		model.addAttribute("notes", dao.getNotes(bid));
		
		return "accessNotes";
	}
	
	@RequestMapping("/template")
	public String template(){
		System.out.println("In Notes");
		
		
		
		return "template";
	}


}
