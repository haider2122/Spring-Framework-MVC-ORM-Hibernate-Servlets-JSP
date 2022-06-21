package com.project.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import com.project.Dao.NotesDao;
import com.project.Entities.Notes;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	@Qualifier("Dao")
	NotesDao dao;
	
	
	@RequestMapping("/home")
	public String home(Model model){
		System.out.println("In home");
		
		//System.out.println(this.dao.getNotes().toString());
		
		model.addAttribute("all_notes",this.dao.getNotes());
		return "home";
	}
	
	@RequestMapping(value="/addNotes")
	public String addNotes() {
		System.out.println("In addnotes");
		
		return "addNotes";
	}
	
	@RequestMapping(value="/saveDetails",method=RequestMethod.POST)
	public RedirectView saveDetails(@ModelAttribute Notes note,HttpServletRequest req) {
		System.out.println("In saveDetails");
		
		System.out.println(note);
		
		dao.CreateNotes(note);
		RedirectView rdv=new RedirectView();
		rdv.setUrl(req.getContextPath()+"/home");
//		System.out.println(nid);
		return rdv;
	}
	
	@RequestMapping(value="/deleteNote/{nid}")
	public String deleteNote(@PathVariable("nid") int nid,HttpServletRequest req){
		
		System.out.println(nid);
		
		dao.deleteNote(nid);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		
		
		return "login";
	}
}
