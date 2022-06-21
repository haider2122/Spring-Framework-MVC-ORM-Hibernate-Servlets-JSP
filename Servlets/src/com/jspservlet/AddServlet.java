package com.jspservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
//You Should get Rid of stuff in the xml file first
//using annotation to  link address
public class AddServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int x= Integer.parseInt(req.getParameter("num1"));
		int y= Integer.parseInt(req.getParameter("num2"));
		
		int z=x+y;
		PrintWriter out=res.getWriter();
		
		//out.println("Value is:"+ z);
		
		
		//res.sendRedirect("contextconfig");
		
	/*	Cookie ck1=new Cookie("x",x+"");
		Cookie ck2=new Cookie("y",x+"");
		Cookie ck3=new Cookie("Name","Cookie-Haider");
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		res.sendRedirect("cookiepage");*/
		//Http Session
//		HttpSession session=req.getSession();
//		session.setAttribute("x",x);
//		session.setAttribute("y",y);
//		session.setAttribute("myname","Haider");
		
		
		//res.sendRedirect("sessionpage");
		//REDIRECT--URL REWRITING
		
		
		
		//res.sendRedirect("redirect?x="+x+"&y="+y);
		
		//DISPATCH METHODS
		
//		RequestDispatcher rd= req.getRequestDispatcher("nextpage");
//		
//		req.setAttribute("val1", x);
//		req.setAttribute("val2", y);
//		rd.forward(req, res);
//		
//		System.out.println(z);
	

	//res.sendRedirect("redirectServlet");
	
	}
}
